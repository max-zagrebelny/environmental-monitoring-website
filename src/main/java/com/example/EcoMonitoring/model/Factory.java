package com.example.EcoMonitoring.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "factory")
public class Factory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name_factory")
    private String name;

    @OneToMany(mappedBy = "factory", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ElementFactory> elements;

    @ManyToOne
    @JoinColumn(name = "city_id")
    private City city;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "population_id")
    private PopulationLoss population;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "animal_id")
    private AnimalLoss animal;
    public Factory() {

    }

    public Factory(String name) {
        this.name = name;
        elements = new ArrayList<>();
    }


    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<ElementFactory> getElements() {
        return elements;
    }

    public void setElements(List<ElementFactory> elements) {
        this.elements = elements;
    }

    public void addElement(ElementFactory element) {
           element.setFactory(this);
            elements.add(element);
        }


    public void removeElement(ElementFactory element) {
        elements.remove(element);
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

}
