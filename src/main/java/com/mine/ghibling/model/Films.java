package com.mine.ghibling.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import java.util.List;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder(toBuilder = true)
@Table(name = "films")
@Entity
public class Films {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    @JsonIgnore
    private Integer id;

    @Column(nullable = false)
    @JsonProperty("id")
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
    private List<String> people;

    @Transient
    private List<String> species;

    @Transient
    private List<String> locations;

    @Transient
    private List<String> vehicles;

    @Column(nullable = false)
    private String url;
}
