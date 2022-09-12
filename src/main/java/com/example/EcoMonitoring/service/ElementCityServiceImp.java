package com.example.EcoMonitoring.service;

import com.example.EcoMonitoring.model.ElementCity;
import com.example.EcoMonitoring.repository.ElementCityRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ElementCityServiceImp implements ElementCityService {


    private final ElementCityRepository elementCityRepository;

    public ElementCityServiceImp(ElementCityRepository elementCityRepository) {
        this.elementCityRepository = elementCityRepository;
    }

    @Override
    public List<ElementCity> findAll() {
        return elementCityRepository.findAll();
    }

    @Override
    public ElementCity findByNameElement(String nameElement) {
        return elementCityRepository.findByNameElement(nameElement);
    }
}
