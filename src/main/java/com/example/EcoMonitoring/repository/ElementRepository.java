package com.example.EcoMonitoring.repository;


import com.example.EcoMonitoring.model.City;
import com.example.EcoMonitoring.model.Element;
import com.example.EcoMonitoring.model.ElementFactory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ElementRepository extends JpaRepository<Element, Long> {
    Element findByNameElement(String nameElement);

}
