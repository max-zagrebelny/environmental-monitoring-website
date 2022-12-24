package com.example.EcoMonitoring.service;

import com.example.EcoMonitoring.model.AnimalLoss;
import com.example.EcoMonitoring.utils.FactoryLosses;

import java.util.List;

public interface AnimalLossService {
    List<AnimalLoss> findAll();
    List<FactoryLosses>calculateLosses(List<FactoryLosses> factoryLosses);

}
