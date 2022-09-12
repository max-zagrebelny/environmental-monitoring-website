package com.example.EcoMonitoring.repository;

import com.example.EcoMonitoring.model.City;
import com.example.EcoMonitoring.model.Factory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FactoryRepository extends JpaRepository<Factory, Long> {
}
