package com.example.EcoMonitoring.repository;

import com.example.EcoMonitoring.model.Nuclear;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NuclearRepository extends JpaRepository<Nuclear, Long> {

}
