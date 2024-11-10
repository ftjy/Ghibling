package com.mine.ghibling.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name = "people")
@Entity
public class People {
    @Id
    @Column(name="person_id", nullable = false)
    private String id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String gender;

    @Column(nullable = false)
    private String age;

    @Column(nullable = false)
    private String eye_color;

    @Column(nullable = false)
    private String hair_color;

    @Column(nullable = false)
    private String species;

    @Column(nullable = false)
    private String url;
}
