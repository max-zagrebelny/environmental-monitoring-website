package com.example.EcoMonitoring.service;

import com.example.EcoMonitoring.model.City;
import com.example.EcoMonitoring.model.ElementFactory;
import com.example.EcoMonitoring.model.Factory;
import com.example.EcoMonitoring.utils.RiskAssessmentWater;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class WaterQualityRiskService {

    public List<RiskAssessmentWater> calculateRisk(final City city) {

        List<ElementFactory> elementFactories = new ArrayList<>();
        List<RiskAssessmentWater> riskAssessment = new ArrayList<>();

        for (Factory factory : city.getFactories()) {
            for (ElementFactory element : factory.getElements()) {
                if (element.getCodeTax() >= 35 && element.getCodeTax() <= 48) {
                    elementFactories.add(element);
                }
            }
        }

        for(ElementFactory element: elementFactories) {

            Double ladd = (element.getValue() / 1000) * 1.4 * 365 * 1 * 70 * 365;
            Double drinkingWaterRisk = 1 - Math.exp((Math.log(0.84) / (element.getElement().getMaxOnce() / 100)) *  ladd);
            Double surfaceWaterRisk = 1 - Math.exp(Math.log(0.84) / (element.getElement().getMaxOnce() / 100 * 4) * (element.getValue() / 1000));
            riskAssessment.add(new RiskAssessmentWater( around(drinkingWaterRisk), findRiskLevel(drinkingWaterRisk), around(surfaceWaterRisk), findRiskLevel(surfaceWaterRisk), element.getFactory().getName(), element.getNameElement()));
        }

        return riskAssessment;
    }

    public String findRiskLevel(Double risk) {
        if(risk < 0.1) return "Рівні мінімального ризику";
        else if(risk >= 0.1 && risk <= 0.19) return "Граничні хронічні ефекти";
        else if(risk >= 0.2 && risk <= 0.59) return  "Важкі хронічні ефекти";
        else if(risk >= 0.6 && risk <= 0.89) return  "Важкі гострі ефекти";
        else return  "Смертельні ефекти";
    }

    public Double around(Double amount) {
        Double scale = Math.pow(10, 3);
        return Math.ceil(amount * scale) / scale;
    }

}
