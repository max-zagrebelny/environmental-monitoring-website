package com.example.EcoMonitoring.repository;


import com.example.EcoMonitoring.model.ElementCity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface ElementCityRepository extends JpaRepository<ElementCity, Integer> {
    ElementCity findByNameElement(String name);
}