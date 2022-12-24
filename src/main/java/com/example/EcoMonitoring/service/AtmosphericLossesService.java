package com.example.EcoMonitoring.service;

import com.example.EcoMonitoring.model.City;
import com.example.EcoMonitoring.utils.FactoryLosses;

import java.util.List;

public interface AtmosphericLossesService {
    List<FactoryLosses>calculateLosses(List<FactoryLosses> factoryLosses, City city);
}
