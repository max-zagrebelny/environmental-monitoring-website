package com.example.EcoMonitoring.utils;

public class FactoryLosses {

    private String factoryName;
    private String namePopLosses;
    private Double hp;
    private String nameAtmoLosses;
    private Double af;
    private String nameAnimalLosses;
    private Double mtv;

    public FactoryLosses(){}

    public FactoryLosses(String factoryName, String namePopLosses, Double hp, String nameAtmoLosses, Double af,  String nameAnimalLosses, Double mtv) {
        this.factoryName = factoryName;
        this.namePopLosses = namePopLosses;
        this.hp = hp;
        this.nameAtmoLosses = nameAtmoLosses;
        this.af = af;
        this.nameAnimalLosses = nameAnimalLosses;
        this.mtv = mtv;
    }

    public FactoryLosses(String factoryName, String namePopLosses, Double hp){
        this.factoryName = factoryName;
        this.namePopLosses = namePopLosses;
        this.hp = hp;
    }

    public FactoryLosses(String factoryName){
        this.factoryName = factoryName;
    }

    public String getFactoryName() {
        return factoryName;
    }

    public void setFactoryName(String factoryName) {
        this.factoryName = factoryName;
    }

    public String getNamePopLosses() {
        return namePopLosses;
    }

    public void setNamePopLosses(String namePopLosses) {
        this.namePopLosses = namePopLosses;
    }

    public Double getHp() {
        return hp;
    }

    public void setHp(Double hp) {
        this.hp = hp;
    }

    public String getNameAtmoLosses() {
        return nameAtmoLosses;
    }

    public void setNameAtmoLosses(String nameAtmoLosses) {
        this.nameAtmoLosses = nameAtmoLosses;
    }

    public Double getAf() {
        return af;
    }

    public void setAf(Double af) {
        this.af = af;
    }

    public String getNameAnimalLosses() {
        return nameAnimalLosses;
    }

    public void setNameAnimalLosses(String nameAnimalLosses) {
        this.nameAnimalLosses = nameAnimalLosses;
    }

    public Double getMtv() {
        return mtv;
    }

    public void setMtv(Double mtv) {
        this.mtv = mtv;
    }
}
