package com.example.EcoMonitoring.service;

import com.example.EcoMonitoring.model.City;
import com.example.EcoMonitoring.model.PopulationLoss;
import com.example.EcoMonitoring.repository.PopulationLossRepository;
import com.example.EcoMonitoring.utils.FactoryLosses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PopulationLossServiceImp implements PopulationLossService {
    @Autowired
    private PopulationLossRepository populationLossRepository;

    @Override
    public List<PopulationLoss> findAll() {
        return populationLossRepository.findAll();
    }

    @Override
    public Optional<PopulationLoss> findById(Long Id) {
        return populationLossRepository.findById(Id);
    }

    @Override
    public List<FactoryLosses> calculateLoses(List<FactoryLosses> factoryLosses) {

        List<PopulationLoss> populationLosses = new ArrayList<>();
        populationLosses.addAll(findAll());
        for(PopulationLoss popLoss : populationLosses) {
            Double vtpp = 0.28 * popLoss.getMlN() + 6.5 * popLoss.getMtN() + 37 * popLoss.getMiN() + 47 * popLoss.getMzN();
            Double vdp = 12 * 0.15 * popLoss.getNz();
            Double vvtg = 12 * 0.037 * (18 - popLoss.getVd()) * popLoss.getCch();
            Double hp = vtpp + vdp + vvtg;
            hp *= 1000;
            Double scale = Math.pow(10, 3);
            Double result = Math.ceil(hp * scale) / scale;

            for(FactoryLosses factLoss : factoryLosses) {
                if(factLoss.getFactoryName().equals(popLoss.getFactory().getName())) {
                    factLoss.setNamePopLosses("Збитки від втрати життя та здоров'я населення");
                    factLoss.setHp(result);
                }
            }
        }
        return factoryLosses;
    }
}
