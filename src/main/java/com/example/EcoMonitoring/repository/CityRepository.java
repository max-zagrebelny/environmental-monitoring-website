package com.example.EcoMonitoring.repository;


import com.example.EcoMonitoring.model.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;


public interface CityRepository extends JpaRepository<City, Integer> {

}