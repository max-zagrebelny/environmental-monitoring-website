package com.example.EcoMonitoring.repository;


import org.springframework.stereotype.Repository;


import com.example.EcoMonitoring.model.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

@Repository
public interface CityRepository extends JpaRepository<City, Integer> {
    Optional<City> findById(Long id);
    City findByName(String name);
}