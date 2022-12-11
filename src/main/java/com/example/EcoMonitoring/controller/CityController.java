package com.example.EcoMonitoring.controller;
import com.example.EcoMonitoring.model.City;
import com.example.EcoMonitoring.service.*;
import com.example.EcoMonitoring.utils.CompensationDamage;
import com.example.EcoMonitoring.utils.FactoryTaxes;
import com.example.EcoMonitoring.utils.RiskAssessment;
import com.example.EcoMonitoring.utils.RiskAssessmentWater;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;


@Controller
public class CityController {

    @Autowired
    private final CityService cityService;
    @Autowired
    private final EnvironmentalTaxService environmentalTaxService;

    @Autowired
    private final ConcentrationService concentrationService;

    @Autowired
    private WaterQualityRiskService waterQualityRiskService;

    @Autowired
    private CompensationDamageService compensationDamageService;

    public CityController(CityService cityService, EnvironmentalTaxService environmentalTaxService, ConcentrationService concentrationService) {
        this.cityService = cityService;
        this.environmentalTaxService = environmentalTaxService;
        this.concentrationService = concentrationService;

    }


    @RequestMapping("/home")
    public String home(Model model,
                       @RequestParam(value = "cityName", required = false) String cityName,
                       @RequestParam(value = "cityYear", required = false) Integer cityYear,
                       @RequestParam(value = "atmos", required = false) boolean atmos,
                       @RequestParam(value = "aquas", required = false) boolean aquas,
                       @RequestParam(value = "alloc", required = false) boolean alloc,
                       @RequestParam(value = "radios", required = false) boolean radios,
                       @RequestParam(value = "radiosAlloc", required = false) boolean radiosAlloc){
        City city = new City();
        List<FactoryTaxes> factoryTaxes = new ArrayList<>();
        List<RiskAssessment> riskAssessments = new ArrayList<>();
        List<RiskAssessmentWater> riskAssessmentsWater = new ArrayList<>();
        List<CompensationDamage> compensationDamages = new ArrayList<>();

        if(cityName != null && cityYear != null) {

            try {

                city = cityService.findByNameAndYear(cityName, cityYear);

                if(atmos || aquas || alloc || radios || radiosAlloc) {
                    factoryTaxes = environmentalTaxService.calculateTax(city, atmos, aquas, alloc, radios, radiosAlloc);
                }

                riskAssessments = concentrationService.calculateRisk(city);
                riskAssessmentsWater = waterQualityRiskService.calculateRisk(city);
                compensationDamages = compensationDamageService.calculateDamages(city);


            } catch (NullPointerException e) {

                model.addAttribute("city", cityName);
                model.addAttribute("year", cityYear);

                return "error";
            }
        }

        model.addAttribute("city", city);
        model.addAttribute("taxes", factoryTaxes);
        model.addAttribute("size", factoryTaxes.size());
        model.addAttribute("risk" , riskAssessments);
        model.addAttribute("riskWater" , riskAssessmentsWater);
        model.addAttribute("damages", compensationDamages);


        return "home";
    }
}
