package com.example.EcoMonitoring.service;

import com.example.EcoMonitoring.model.City;
import com.example.EcoMonitoring.model.ElementFactory;
import com.example.EcoMonitoring.utils.CompensationDamage;

import java.util.List;

public interface CompensationDamageService {


    List<CompensationDamage> calculateDamages(City city);
}
