package com.mine.ghibling.model;

import jakarta.persistence.*;

import java.util.List;

@Table(name = "species")
@Entity
public class Species {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private Integer id;

    @Column(nullable = false)
    private String species_id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String classification;

    @Column(nullable = false)
    private String eye_colors;

    @Column(nullable = false)
    private String hair_colors;

    @Transient
    private List<String> people;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSpecies_id() {
        return species_id;
    }

    public void setSpecies_id(String species_id) {
        this.species_id = species_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    public String getEye_colors() {
        return eye_colors;
    }

    public void setEye_colors(String eye_colors) {
        this.eye_colors = eye_colors;
    }

    public String getHair_colors() {
        return hair_colors;
    }

    public void setHair_colors(String hair_colors) {
        this.hair_colors = hair_colors;
    }

    public List<String> getPeople() {
        return people;
    }

    public void setPeople(List<String> people) {
        this.people = people;
    }

    @Override
    public String toString() {
        return "Species{" +
                "id=" + id +
                ", species_id='" + species_id + '\'' +
                ", name='" + name + '\'' +
                ", classification='" + classification + '\'' +
                ", eye_colors='" + eye_colors + '\'' +
                ", hair_colors='" + hair_colors + '\'' +
                ", people=" + people +
                '}';
    }
}
