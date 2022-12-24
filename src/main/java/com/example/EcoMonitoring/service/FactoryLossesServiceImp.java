package com.example.EcoMonitoring.service;

import com.example.EcoMonitoring.model.City;
import com.example.EcoMonitoring.model.Factory;
import com.example.EcoMonitoring.utils.FactoryLosses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FactoryLossesServiceImp implements FactoryLossesService{

    @Autowired
    private PopulationLossService populationLossService;
    @Autowired
    private AtmosphericLossesService atmosphericLossesService;
    @Autowired
    private AnimalLossService animalLossService;

    @Override
    public List<FactoryLosses> calculatefactoryLoses(City city) {
        List<FactoryLosses> factoryLosses = new ArrayList<>();
        for(Factory factory : city.getFactories()) {
            factoryLosses.add(new FactoryLosses(factory.getName()));
        }

        factoryLosses =  populationLossService.calculateLoses(factoryLosses);
        factoryLosses = atmosphericLossesService.calculateLosses(factoryLosses,city);
        factoryLosses = animalLossService.calculateLosses(factoryLosses);
        return factoryLosses;
    }
}
