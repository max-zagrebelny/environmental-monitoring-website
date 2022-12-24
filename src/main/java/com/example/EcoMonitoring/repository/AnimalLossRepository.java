package com.example.EcoMonitoring.repository;

import com.example.EcoMonitoring.model.AnimalLoss;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnimalLossRepository extends JpaRepository<AnimalLoss, Long> {
}
