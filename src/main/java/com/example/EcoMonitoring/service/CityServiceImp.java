package com.example.EcoMonitoring.service;

import com.example.EcoMonitoring.model.City;
import com.example.EcoMonitoring.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CityServiceImp implements CityService {

    @Autowired
    private CityRepository cityRepository;
    @Autowired
    private final ElementFactoryService elementFactoryService;

    public CityServiceImp(CityRepository cityRepository, ElementFactoryService elementFactoryService) {
        this.cityRepository = cityRepository;
        this.elementFactoryService = elementFactoryService;
    }


    @Override
    public Optional<City> findById(Long id) {
        return cityRepository.findById(id);
    }

    @Override
    public void delete(City city) {
        cityRepository.delete(city);
    }

    @Override
    public City findByName(String name) {
        return cityRepository.findByName(name);
    }


}
