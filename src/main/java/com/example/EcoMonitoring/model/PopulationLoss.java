package com.example.EcoMonitoring.model;

import javax.persistence.*;

@Entity
public class PopulationLoss {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double mlN;
    private Double mtN;
    private Double miN;
    private Double mzN;
    private Double nz;
    private Double vd;
    private Double cch;

    @OneToOne(mappedBy = "population")
    private Factory Factory;

    public PopulationLoss() {}

    public PopulationLoss(Long id, Double mlN, Double mtN, Double miN, Double mzN,  Double nz,  Double vd, Double cch, com.example.EcoMonitoring.model.Factory factory) {
        this.id = id;

        this.mlN = mlN;
        this.mtN = mtN;
        this.miN = miN;
        this.mzN = mzN;
        this.nz = nz;
        this.vd = vd;
        this.cch = cch;
        Factory = factory;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public Double getNz() {
        return nz;
    }

    public void setNz(Double nz) {
        this.nz = nz;
    }


    public Double getVd() {
        return vd;
    }

    public void setVd(Double vd) {
        this.vd = vd;
    }

    public Double getCch() {
        return cch;
    }

    public void setCch(Double cch) {
        this.cch = cch;
    }

    public com.example.EcoMonitoring.model.Factory getFactory() {
        return Factory;
    }

    public void setFactory(com.example.EcoMonitoring.model.Factory factory) {
        Factory = factory;
    }

    public Double getMlN() {
        return mlN;
    }

    public void setMlN(Double mlN) {
        this.mlN = mlN;
    }

    public Double getMtN() {
        return mtN;
    }

    public void setMtN(Double mtN) {
        this.mtN = mtN;
    }

    public Double getMiN() {
        return miN;
    }

    public void setMiN(Double miN) {
        this.miN = miN;
    }

    public Double getMzN() {
        return mzN;
    }

    public void setMzN(Double mzN) {
        this.mzN = mzN;
    }
}
