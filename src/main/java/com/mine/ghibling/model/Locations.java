package com.mine.ghibling.model;

import jakarta.persistence.*;

import java.util.List;

@Table(name = "locations")
@Entity
public class Locations {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private Integer id;

    @Column(nullable = false)
    private String location_id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String climate;

    @Column(nullable = false)
    private String terrain;

    @Column(nullable = false)
    private String surface_water;

    @Transient
    private List<People> people;

    @Column(nullable = false)
    private String url;
}
