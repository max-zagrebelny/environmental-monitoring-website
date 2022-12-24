package com.example.EcoMonitoring.service;

import com.example.EcoMonitoring.model.AnimalLoss;
import com.example.EcoMonitoring.repository.AnimalLossRepository;
import com.example.EcoMonitoring.utils.FactoryLosses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AnimalLossServiceImpl implements AnimalLossService {

    @Autowired
    private AnimalLossRepository animalLossRepository;

    @Override
    public List<AnimalLoss> findAll() {
        return animalLossRepository.findAll();
    }

    @Override
    public List<FactoryLosses> calculateLosses(List<FactoryLosses> factoryLosses) {
        List<AnimalLoss> animalLosses = new ArrayList<>();
        animalLosses.addAll(findAll());
        for(AnimalLoss animLos : animalLosses){
            for(FactoryLosses fl : factoryLosses){
                if(fl.getFactoryName().equals(animLos.getFactory().getName())) {
                    fl.setNameAnimalLosses("Збитки від втрат тваринництва");
                    fl.setMtv(animLos.getAmountDamages() * animLos.getTotalWeight());
                }
            }
        }

        return factoryLosses;
    }
}
