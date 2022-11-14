
package com.example.EcoMonitoring.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Concentration {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    private Double rfc;
    private Double sf;
    private String typeRisk;
    private String criticalOrgans;

    private String isCarcinogen;


    @OneToMany(mappedBy = "concentration")
    private List<ElementFactory> elementFactories;

    public Concentration() {}

    public Concentration(Long id, Double rfc, Double sf, String typeRisk, String criticalOrgans, String isCarcinogen ) {
        this.id = id;
        this.rfc = rfc;
        this.sf = sf;
        this.typeRisk = typeRisk;
        this.criticalOrgans = criticalOrgans;
        this.isCarcinogen = isCarcinogen;
    }

    public Double getSf() {
        return sf;
    }

    public void setSf(Double sf) {
        this.sf = sf;
    }

    public String getTypeRisk() {
        return typeRisk;
    }

    public void setTypeRisk(String typeRisk) {
        this.typeRisk = typeRisk;
    }

    public List<ElementFactory> getElementFactories() {
        return elementFactories;
    }

    public void setElementFactories(List<ElementFactory> elementFactories) {
        this.elementFactories = elementFactories;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getRfc() {
        return rfc;
    }

    public void setRfc(Double rfc) {
        this.rfc = rfc;
    }

    public String getCriticalOrgans() {
        return criticalOrgans;
    }

    public void setCriticalOrgans(String criticalOrgans) {
        this.criticalOrgans = criticalOrgans;
    }

    public String getIsCarcinogen() {
        return this.isCarcinogen;
    }

    public void setIsCarcinogen(String isCarcinogen) {
        this.isCarcinogen = isCarcinogen;
    }
}