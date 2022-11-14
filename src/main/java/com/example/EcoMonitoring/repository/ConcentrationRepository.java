package com.example.EcoMonitoring.repository;

import com.example.EcoMonitoring.model.Concentration;
import com.example.EcoMonitoring.model.Factory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConcentrationRepository extends JpaRepository<Concentration, Long> {
}
