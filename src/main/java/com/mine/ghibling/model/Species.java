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
    private List<People> people;
}
