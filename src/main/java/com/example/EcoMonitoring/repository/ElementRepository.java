package com.example.EcoMonitoring.repository;


import com.example.EcoMonitoring.model.City;
import com.example.EcoMonitoring.model.Element;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface ElementRepository extends JpaRepository<Element, Integer> {
    Element findByNameElement(String name);
}
