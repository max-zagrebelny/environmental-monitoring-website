package com.example.EcoMonitoring.controller;
import com.example.EcoMonitoring.model.City;
import com.example.EcoMonitoring.service.CityService;
import com.example.EcoMonitoring.service.EnvironmentalTaxService;
import com.example.EcoMonitoring.utils.FactoryTaxes;
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

    public CityController(CityService cityService, EnvironmentalTaxService environmentalTaxService) {
        this.cityService = cityService;
        this.environmentalTaxService = environmentalTaxService;
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
        if(cityName != null && cityYear != null) {

            try {

                city = cityService.findByNameAndYear(cityName, cityYear);

                if(atmos || aquas || alloc || radios || radiosAlloc) {

                    factoryTaxes = environmentalTaxService.calculateTax(city, atmos, aquas, alloc, radios, radiosAlloc);

                }

            } catch (NullPointerException e) {

                model.addAttribute("city", cityName);
                model.addAttribute("year", cityYear);
                return "error";
            }


        }
        else if (cityName != null && cityYear == null) {
            try {

                city = cityService.findByName(cityName);

                if(atmos || aquas || alloc || radios || radiosAlloc) {

                    factoryTaxes = environmentalTaxService.calculateTax(city, atmos, aquas, alloc, radios, radiosAlloc);

                }
            } catch (NullPointerException e) {

                model.addAttribute("city", cityName);

                return "error";
            }
        }



        model.addAttribute("city", city);
        model.addAttribute("taxes", factoryTaxes);
        model.addAttribute("size", factoryTaxes.size());

        return "home";
    }
}
