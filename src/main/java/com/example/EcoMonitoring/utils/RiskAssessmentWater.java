package com.example.EcoMonitoring.utils;

public class RiskAssessmentWater {
    private Double drinkingWater;
    private String leveldrinkingWater;
    private Double surfaceWater;
    private String levelSurfaceWater;

    private String nameFactory;
    private String nameElement;

    public RiskAssessmentWater(Double drinkingWater, String leveldrinkingWater, Double surfaceWater, String levelSurfaceWater, String nameFactory, String nameElement) {
        this.drinkingWater = drinkingWater;
        this.leveldrinkingWater = leveldrinkingWater;
        this.surfaceWater = surfaceWater;
        this.levelSurfaceWater = levelSurfaceWater;
        this.nameFactory = nameFactory;
        this.nameElement = nameElement;
    }



    public Double getDrinkingWater() {
        return drinkingWater;
    }

    public void setDrinkingWater(Double drinkingWater) {
        this.drinkingWater = drinkingWater;
    }

    public String getLeveldrinkingWater() {
        return leveldrinkingWater;
    }

    public void setLeveldrinkingWater(String leveldrinkingWater) {
        this.leveldrinkingWater = leveldrinkingWater;
    }

    public Double getSurfaceWater() {
        return surfaceWater;
    }

    public void setSurfaceWater(Double surfaceWater) {
        this.surfaceWater = surfaceWater;
    }

    public String getLevelSurfaceWater() {
        return levelSurfaceWater;
    }

    public void setLevelSurfaceWater(String levelSurfaceWater) {
        this.levelSurfaceWater = levelSurfaceWater;
    }

    public String getNameFactory() {
        return nameFactory;
    }

    public void setNameFactory(String nameFactory) {
        this.nameFactory = nameFactory;
    }

    public String getNameElement() {
        return nameElement;
    }

    public void setNameElement(String nameElement) {
        this.nameElement = nameElement;
    }
}
