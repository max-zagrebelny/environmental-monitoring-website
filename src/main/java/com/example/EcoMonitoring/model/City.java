package com.example.EcoMonitoring.model;



import javax.lang.model.element.Element;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "city")
public class City {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name_city")
    private String name;

    @OneToMany(mappedBy = "city")
    private List<ElementCity> elements;

    public City() {
    }

    public City(String name) {
        this.name = name;
        elements = new ArrayList<>();
    }

    public void addElement(ElementCity element) {
        element.setCity(this);
        elements.add(element);
    }

    public void removeElement(ElementCity element) {
        elements.remove(element);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ElementCity> getElements() {
        return elements;
    }

    public void setElements(List<ElementCity> elements) {
        this.elements = elements;
    }
}