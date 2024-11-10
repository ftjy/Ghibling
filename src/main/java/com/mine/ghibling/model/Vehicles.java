package com.mine.ghibling.model;

import jakarta.persistence.*;

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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getVehicle_id() {
        return vehicle_id;
    }

    public void setVehicle_id(String vehicle_id) {
        this.vehicle_id = vehicle_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getVehicle_class() {
        return vehicle_class;
    }

    public void setVehicle_class(String vehicle_class) {
        this.vehicle_class = vehicle_class;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public String getPilot() {
        return pilot;
    }

    public void setPilot(String pilot) {
        this.pilot = pilot;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "Vehicles{" +
                "id=" + id +
                ", vehicle_id='" + vehicle_id + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", vehicle_class='" + vehicle_class + '\'' +
                ", image='" + image + '\'' +
                ", length='" + length + '\'' +
                ", pilot='" + pilot + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
