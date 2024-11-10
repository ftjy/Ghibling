package com.mine.ghibling.model;

import jakarta.persistence.*;

import java.util.List;

import com.mine.ghibling.model.*;

@Table(name = "films")
@Entity
public class Films {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private Integer id;

    @Column(nullable = false)
    private String film_id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String original_title;

    @Column(nullable = false)
    private String original_title_romanised;

    @Column(nullable = false)
    private String image;

    @Column(nullable = false)
    private String movie_banner;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private String director;

    @Column(nullable = false)
    private String producer;

    @Column(nullable = false)
    private String release_date;

    @Column(nullable = false)
    private String running_time;

    @Column(nullable = false)
    private String rt_score;

    @Transient
    private List<People> people;

    @Transient
    private List<Species> species;

    @Transient
    private List<Locations> locations;

    @Transient
    private List<Vehicles> vehicles;

    @Column(nullable = false)
    private String url;
}
