package com.example.EcoMonitoring.service;

import com.example.EcoMonitoring.model.*;
import com.example.EcoMonitoring.repository.EnvironmentalTaxRepository;
import com.example.EcoMonitoring.utils.FactoryTaxes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
public class EnvironmentalTaxServiceImp implements EnvironmentalTaxService{
    @Autowired
    private EnvironmentalTaxRepository taxRepository;


    @Override
    public EnvironmentalTax findByNameAndType(String nameElement, String type, City city) {

        return taxRepository.findByNameElementAndType(nameElement, type);
    }

    @Override
    public List<EnvironmentalTax> findByType(String type) {
        return taxRepository.findByType(type);
    }

    public List<EnvironmentalTax> findEnvironmentalTaxes(Boolean atmos, Boolean aquas, Boolean alloc, Boolean radios, Boolean radiosAlloc) {

        List<EnvironmentalTax> envElements = new ArrayList<>();

        if(atmos){
            envElements.addAll(findByType("Викиди в атмосферне повітря"));
        }
        if(aquas){
            envElements.addAll(findByType("Cкиди окремих забруднюючих речовин у водні об’єкти"));
        }
        if(alloc) {
            envElements.addAll(findByType("Розміщення відходів"));
        }
        if(radios) {
            envElements.addAll(findByType("Утворення радіоактивних відходів"));
        }
        if(radiosAlloc)
        {
            envElements.addAll(findByType("Тимчасове зберігання радіоактивних відходів"));
        }
        return envElements;
    }
    @Override
    public List<FactoryTaxes> calculateTax(City city, Boolean atmos, Boolean aquas, Boolean alloc, Boolean radios, Boolean radiosAlloc) {
        List<FactoryTaxes> factoryTaxes = new ArrayList<>();
        List<EnvironmentalTax> envElements = findEnvironmentalTaxes(atmos, aquas, alloc, radios, radiosAlloc);
        List<ElementFactory> elementFactories = new ArrayList<>();

        for (Factory factory : city.getFactories()) {
            elementFactories.addAll(factory.getElements());
        }

        for (ElementFactory elementFactory : elementFactories) {
            for (EnvironmentalTax tempEnvElem : envElements) {


                if (tempEnvElem.getId() == elementFactory.getCodeTax()) {

                        Double taxAmount = elementFactory.getTotalEmissions() * tempEnvElem.getTaxRates();
                        Double scale = Math.pow(10, 3);
                        Double result = Math.ceil(taxAmount * scale) / scale;
                    factoryTaxes.add(new FactoryTaxes(elementFactory.getFactory().getName(), elementFactory.getNameElement(),
                            elementFactory.getTotalEmissions(), tempEnvElem.getTaxRates(), result));
                }

            }
        }
        return factoryTaxes;
    }

    public FactoryTaxes calcTotalEmission(ElementFactory elementFactory, Double rate) {

        return new FactoryTaxes(elementFactory.getFactory().getName(), elementFactory.getNameElement(),
                elementFactory.getValue(), rate,elementFactory.getTotalEmissions() * rate);
    }
}