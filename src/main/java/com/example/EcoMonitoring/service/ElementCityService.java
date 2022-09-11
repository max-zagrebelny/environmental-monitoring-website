package com.example.EcoMonitoring.service;

import com.example.EcoMonitoring.model.ElementCity;

import java.util.List;

public interface ElementCityService {
    List<ElementCity> findAll();
    ElementCity findOne(String name);
}
