package com.example.EcoMonitoring.repository;

import com.example.EcoMonitoring.model.EnvironmentalTax;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EnvironmentalTaxRepository extends JpaRepository<EnvironmentalTax, Long> {
    EnvironmentalTax findByNameElementAndType(String nameElement, String type);
    List<EnvironmentalTax> findByType(String type);
}
