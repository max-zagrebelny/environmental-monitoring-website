package com.example.EcoMonitoring.service;

import com.example.EcoMonitoring.model.City;
import com.example.EcoMonitoring.repository.CityRepository;
import com.example.EcoMonitoring.repository.ElementCityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CityServiceImp implements CityService {

    @Autowired
    private CityRepository cityRepository;
    @Autowired
    private final ElementCityService elementCityService;

    public CityServiceImp(CityRepository cityRepository, ElementCityService elementCityService) {
        this.cityRepository = cityRepository;
        this.elementCityService = elementCityService;
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
