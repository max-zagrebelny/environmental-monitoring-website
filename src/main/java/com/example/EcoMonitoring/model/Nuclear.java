package com.example.EcoMonitoring.model;


import javax.persistence.*;

@Entity
@Table(name = "nuclear")
public class Nuclear {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "o_n")
    private Double on;
    private Double h;
    private Double rv;
    private Double restructuring;
    private Double rns;
    private Double c1ns;
    private Double c1v;
    private Double c2ns;
    private Double c2v;
    private Double v1ns;
    private Double v1v;
    private Double v2ns;
    private Double v2v;

    @OneToOne(mappedBy = "nuclear")
    private ElementFactory elementFactories;


    Nuclear(){}

    public Nuclear(Long id, Double on, Double h, Double rv, Double restructuring, Double rns, Double c1ns, Double c1v, Double c2ns, Double c2v, Double v1ns, Double v1v, Double v2ns, Double v2v) {
        this.id = id;

        this.on = on;
        this.h = h;
        this.rv = rv;
        this.restructuring = restructuring;
        this.rns = rns;
        this.c1ns = c1ns;
        this.c1v = c1v;
        this.c2ns = c2ns;
        this.c2v = c2v;
        this.v1ns = v1ns;
        this.v1v = v1v;
        this.v2ns = v2ns;
        this.v2v = v2v;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getOn() {
        return on;
    }

    public void setOn(Double on) {
        this.on = on;
    }

    public Double getH() {
        return h;
    }

    public void setH(Double h) {
        this.h = h;
    }

    public Double getRv() {
        return rv;
    }

    public void setRv(Double rv) {
        this.rv = rv;
    }

    public Double getRestructuring() {
        return restructuring;
    }

    public void setRestructuring(Double restructuring) {
        this.restructuring = restructuring;
    }

    public Double getRns() {
        return rns;
    }

    public void setRns(Double rns) {
        this.rns = rns;
    }

    public Double getC1ns() {
        return c1ns;
    }

    public void setC1ns(Double c1ns) {
        this.c1ns = c1ns;
    }

    public Double getC1v() {
        return c1v;
    }

    public void setC1v(Double c1v) {
        this.c1v = c1v;
    }

    public Double getC2ns() {
        return c2ns;
    }

    public void setC2ns(Double c2ns) {
        this.c2ns = c2ns;
    }

    public Double getC2v() {
        return c2v;
    }

    public void setC2v(Double c2v) {
        this.c2v = c2v;
    }

    public Double getV1ns() {
        return v1ns;
    }

    public void setV1ns(Double v1ns) {
        this.v1ns = v1ns;
    }

    public Double getV1v() {
        return v1v;
    }

    public void setV1v(Double v1v) {
        this.v1v = v1v;
    }

    public Double getV2ns() {
        return v2ns;
    }

    public void setV2ns(Double v2ns) {
        this.v2ns = v2ns;
    }

    public Double getV2v() {
        return v2v;
    }

    public void setV2v(Double v2v) {
        this.v2v = v2v;
    }

    public ElementFactory getElementFactories() {
        return elementFactories;
    }

    public void setElementFactories(ElementFactory elementFactories) {
        this.elementFactories = elementFactories;
    }
}
