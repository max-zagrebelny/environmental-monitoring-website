package com.example.EcoMonitoring.service;

import com.example.EcoMonitoring.model.City;
import com.example.EcoMonitoring.model.ElementFactory;
import com.example.EcoMonitoring.model.EnvironmentalTax;
import com.example.EcoMonitoring.model.Factory;
import com.example.EcoMonitoring.repository.ElementFactoryRepository;
import com.example.EcoMonitoring.utils.CompensationDamage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CompensationDamageServiceImp implements CompensationDamageService{

    @Autowired
    private ElementFactoryRepository elementFactoryRepository;


    @Override
    public List<CompensationDamage> calculateDamages(City city) {
        List<ElementFactory> elements = new ArrayList<>();

        List<CompensationDamage> damages = new ArrayList<>();

        for (Factory factory : city.getFactories()) {
            elements.addAll(factory.getElements());
        }

        for(ElementFactory elementFactory : elements) {
            if(elementFactory.getCodeTax() <  34 && elementFactory.getValue() > elementFactory.getElement().getAverageDaily()) {
                Double m = 3.6 * 0.000001 * (elementFactory.getValue() - elementFactory.getElement().getAverageDaily()) * (elementFactory.getTotalEmissions() * 1_000_000 / 365 / 24 / 3600 / 60 / elementFactory.getValue()) * 1000  * 24 * 365;
                Double damage = 6700 * 1.1 * m * 1/elementFactory.getElement().getMaxOnce() * (1.35 * 1.25) * (elementFactory.getValue() / elementFactory.getElement().getMaxOnce());
                Double scale = Math.pow(10, 3);
                Double result = Math.ceil(damage * scale) / scale;
                damages.add(new CompensationDamage(elementFactory.getFactory().getName(), elementFactory.getNameElement(), result));
            }
        }

        return damages;
    }
}
