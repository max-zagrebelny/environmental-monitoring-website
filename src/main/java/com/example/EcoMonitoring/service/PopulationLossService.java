package com.example.EcoMonitoring.service;

import com.example.EcoMonitoring.model.City;
import com.example.EcoMonitoring.model.PopulationLoss;
import com.example.EcoMonitoring.utils.FactoryLosses;

import java.util.List;
import java.util.Optional;

public interface PopulationLossService {
    List<PopulationLoss> findAll();
    Optional<PopulationLoss> findById(Long Id);

    List<FactoryLosses> calculateLoses(List<FactoryLosses> factoryLosses);
}
