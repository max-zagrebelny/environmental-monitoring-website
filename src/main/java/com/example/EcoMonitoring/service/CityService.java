package com.example.EcoMonitoring.service;

import com.example.EcoMonitoring.model.City;

import java.util.Optional;

public interface CityService {
    Optional<City> findById(Long id);
    void delete(City city);
    void save(City city);
    City findByName(String name);
}
