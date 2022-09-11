package com.example.EcoMonitoring.service;

import com.example.EcoMonitoring.model.ElementCity;
import com.example.EcoMonitoring.repository.ElementCityRepository;
import com.example.EcoMonitoring.repository.ElementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ElementCityServiceImp implements ElementCityService {

    @Autowired
    ElementCityRepository elementCityRepository;

    @Override
    public List<ElementCity> findAll() {
        return elementCityRepository.findAll();
    }

    @Override
    public ElementCity findOne(String name) {
        return elementCityRepository.findByNameElement(name);
    }
}
