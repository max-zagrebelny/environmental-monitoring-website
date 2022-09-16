package com.example.EcoMonitoring.repository;
import com.example.EcoMonitoring.model.Factory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FactoryRepository extends JpaRepository<Factory, Long> {
    List<Factory> findByCityId(Long city_id);
}
