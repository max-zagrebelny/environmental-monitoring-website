package com.example.EcoMonitoring.service;

import com.example.EcoMonitoring.model.City;
import com.example.EcoMonitoring.utils.FactoryLosses;

import java.util.List;

public interface FactoryLossesService {
    List<FactoryLosses> calculatefactoryLoses(City city);
}
