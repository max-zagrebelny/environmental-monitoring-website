package com.example.EcoMonitoring.repository;

import com.example.EcoMonitoring.model.Nuclear;
import com.example.EcoMonitoring.model.PopulationLoss;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PopulationLossRepository extends JpaRepository<PopulationLoss, Long> {
}
