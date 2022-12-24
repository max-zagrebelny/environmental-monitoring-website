package com.example.EcoMonitoring.service;

import com.example.EcoMonitoring.model.City;
import com.example.EcoMonitoring.utils.CompensationDamage;
import com.example.EcoMonitoring.utils.FactoryLosses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AtmosphericLossesServiceImp implements AtmosphericLossesService {

    @Autowired
    private CompensationDamageService compensationDamageService;

    @Override
    public List<FactoryLosses> calculateLosses(List<FactoryLosses> factoryLosses, City city) {
        List<CompensationDamage> compensationDamages = compensationDamageService.calculateDamages(city);

        for(CompensationDamage cD : compensationDamages){
            for(FactoryLosses fl : factoryLosses){
                if(fl.getFactoryName().equals(cD.getNameFactory())){
                    fl.setNameAtmoLosses("Збитки від забруднення атмосферного повітря ");
                    if(fl.getAf() == null) {
                        Double scale = Math.pow(10, 3);
                        Double result = Math.ceil(cD.getCompensationDamage() * scale) / scale;
                        fl.setAf(result);
                    }
                    else {
                        Double avg = fl.getAf();
                        avg += cD.getCompensationDamage();
                        Double scale = Math.pow(10, 3);
                        Double result = Math.ceil(avg * scale) / scale;
                        fl.setAf(result);
                    }
                }
            }
        }
        return factoryLosses;
    }
}

