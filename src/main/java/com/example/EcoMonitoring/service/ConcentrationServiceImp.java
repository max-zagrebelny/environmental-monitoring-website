package com.example.EcoMonitoring.service;

import com.example.EcoMonitoring.model.City;
import com.example.EcoMonitoring.model.ElementFactory;
import com.example.EcoMonitoring.model.Factory;
import com.example.EcoMonitoring.repository.CityRepository;
import com.example.EcoMonitoring.repository.ConcentrationRepository;
import com.example.EcoMonitoring.utils.RiskAssessment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ConcentrationServiceImp implements ConcentrationService {

    @Autowired
    private ConcentrationRepository concentrationRepository;

    public ConcentrationServiceImp(ConcentrationRepository concentrationRepository) {
        this.concentrationRepository = concentrationRepository;
    }

    @Override
    public List<RiskAssessment> calculateRisk(final City city) {
        List<RiskAssessment> riskAssessments = new ArrayList<>();
        List<ElementFactory> elementFactories = new ArrayList<>();

        for (Factory factory : city.getFactories()) {
            for (ElementFactory element : factory.getElements()) {
                if (element.getConcentration() != null) {
                    elementFactories.add(element);
                }
            }
        }

        for (ElementFactory element : elementFactories) {
            Double addLadd = 1.0, cr, pcr;
            addLadd = element.getConcentration().getTypeRisk().equals("Інгаляційний вплив") ? calcaddLadd(element) : -1.0;

            if (element.getConcentration().getIsCarcinogen().equals("+")) {
                riskAssessments.add(getRiskForCarc(element, addLadd));
            }
            else if(element.getConcentration().getIsCarcinogen().equals("-")) {
                riskAssessments.add(getRiskForNonCarc(element, addLadd));
            }
        }

        return riskAssessments;
    }

    public RiskAssessment getRiskForCarc(ElementFactory element, Double addLadd) {
        Double cr, pcr;
        String riskLevel;
        cr = addLadd * element.getConcentration().getSf();
        pcr = around(cr * 300_000);

        if (cr > 0.001) riskLevel = "Високий";
        else if(cr <= 0.001 && cr > 0.0001) riskLevel = "Середній";
        else if(cr <= 0.0001 && cr > 0.000001) riskLevel = "Низький";
        else riskLevel = "Мінімальний";
        return new RiskAssessment(element.getFactory().getName(), element.getNameElement(), addLadd, -1.0 , around(cr), pcr, riskLevel, element.getConcentration().getCriticalOrgans());
    }

    public RiskAssessment getRiskForNonCarc(ElementFactory element, Double addLadd){
        Double hr;
        String riskLevel;
        if(element.getElement().getId() == 337) {

            hr = around(element.getValue() / element.getElement().getMaxOnce());
        }else {

            hr = around(element.getValue() / element.getConcentration().getRfc());
        }


        if(hr < 1.0) riskLevel = "Низький";
        else if (hr == 1.0) riskLevel = "Середній";
        else riskLevel = "Високий";
        return new RiskAssessment(element.getFactory().getName(), element.getNameElement(), addLadd, hr , -1.0, -1.0, riskLevel, element.getConcentration().getCriticalOrgans());
    }

    public Double calcaddLadd(ElementFactory element) {

        if (element.getConcentration().getTypeRisk().equals("Інгаляційний вплив")) {
            return  around(((element.getValue() * 8 * 1.4) + (element.getValue() * 16 * 0.63) * 350 * 30) / (70 * (element.getConcentration().getIsCarcinogen().equals("+") ? 70 : 1) * 365));
        } else return -1.0;
    }

    public Double around(Double amount) {
        Double scale = Math.pow(10, 3);
        return Math.ceil(amount * scale) / scale;
    }


}