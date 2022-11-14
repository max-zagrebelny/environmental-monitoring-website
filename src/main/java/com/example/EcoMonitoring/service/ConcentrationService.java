package com.example.EcoMonitoring.service;

import com.example.EcoMonitoring.model.City;
import com.example.EcoMonitoring.utils.RiskAssessment;

import java.util.List;

public interface ConcentrationService {
    public List<RiskAssessment> calculateRisk(City city);
}
