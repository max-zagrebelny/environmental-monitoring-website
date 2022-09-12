package com.example.EcoMonitoring.repository;


import org.springframework.stereotype.Repository;


import com.example.EcoMonitoring.model.City;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

@Repository
public interface CityRepository extends JpaRepository<City, Long> {
    Optional<City> findById(Long id);
    City findByName(String name);
}