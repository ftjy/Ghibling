package com.mine.ghibling.model;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "vehicles")
@Entity
public class Vehicles {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private Integer id;

    @Column(nullable = false)
    private String vehicle_id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private String vehicle_class;

    @Column(nullable = false)
    private String image;

    @Column(nullable = false)
    private String length;

    @Column(nullable = false)
    private String pilot;

    @Column(nullable = false)
    private String url;
}
