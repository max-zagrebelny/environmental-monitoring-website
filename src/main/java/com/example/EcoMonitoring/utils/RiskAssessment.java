package com.example.EcoMonitoring.utils;

public class RiskAssessment {
    private String factory;
    private String name;
    private Double addLadd;
    private Double hq;
    private Double cr;
    private Double pcr;
    private String riskLevel;
    private String criticalOrgans;

    public RiskAssessment(String factory, String name, Double addLadd, Double hq, Double cr, Double pcr, String riskLevel, String criticalOrgans) {
        this.factory = factory;
        this.name = name;
        this.addLadd = addLadd;
        this.hq = hq;
        this.cr = cr;
        this.pcr = pcr;
        this.riskLevel = riskLevel;
        this.criticalOrgans = criticalOrgans;
    }

    public String getFactory() {
        return factory;
    }

    public void setFactory(String factory) {
        this.factory = factory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getAddLadd() {
        return addLadd;
    }

    public void setAddLadd(Double addLadd) {
        this.addLadd = addLadd;
    }

    public Double getHq() {
        return hq;
    }

    public void setHq(Double hq) {
        this.hq = hq;
    }

    public Double getCr() {
        return cr;
    }

    public void setCr(Double cr) {
        this.cr = cr;
    }

    public Double getPcr() {
        return pcr;
    }

    public void setPcr(Double pcr) {
        this.pcr = pcr;
    }

    public String getRiskLevel() {
        return riskLevel;
    }

    public void setRiskLevel(String riskLevel) {
        this.riskLevel = riskLevel;
    }

    public String getCriticalOrgans() {
        return criticalOrgans;
    }

    public void setCriticalOrgans(String criticalOrgans) {
        this.criticalOrgans = criticalOrgans;
    }
}
