package com.mine.ghibling.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

import java.util.List;

import com.mine.ghibling.model.*;

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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFilm_id() {
        return film_id;
    }

    public void setFilm_id(String film_id) {
        this.film_id = film_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getOriginal_title() {
        return original_title;
    }

    public void setOriginal_title(String original_title) {
        this.original_title = original_title;
    }

    public String getOriginal_title_romanised() {
        return original_title_romanised;
    }

    public void setOriginal_title_romanised(String original_title_romanised) {
        this.original_title_romanised = original_title_romanised;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getMovie_banner() {
        return movie_banner;
    }

    public void setMovie_banner(String movie_banner) {
        this.movie_banner = movie_banner;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getRelease_date() {
        return release_date;
    }

    public void setRelease_date(String release_date) {
        this.release_date = release_date;
    }

    public String getRunning_time() {
        return running_time;
    }

    public void setRunning_time(String running_time) {
        this.running_time = running_time;
    }

    public String getRt_score() {
        return rt_score;
    }

    public void setRt_score(String rt_score) {
        this.rt_score = rt_score;
    }

    public List<String> getPeople() {
        return people;
    }

    public void setPeople(List<String> people) {
        this.people = people;
    }

    public List<String> getSpecies() {
        return species;
    }

    public void setSpecies(List<String> species) {
        this.species = species;
    }

    public List<String> getLocations() {
        return locations;
    }

    public void setLocations(List<String> locations) {
        this.locations = locations;
    }

    public List<String> getVehicles() {
        return vehicles;
    }

    public void setVehicles(List<String> vehicles) {
        this.vehicles = vehicles;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "Films{" +
                "people=" + people +
                ", id=" + id +
                ", film_id='" + film_id + '\'' +
                ", title='" + title + '\'' +
                ", original_title='" + original_title + '\'' +
                ", original_title_romanised='" + original_title_romanised + '\'' +
                ", image='" + image + '\'' +
                ", movie_banner='" + movie_banner + '\'' +
                ", description='" + description + '\'' +
                ", director='" + director + '\'' +
                ", producer='" + producer + '\'' +
                ", release_date='" + release_date + '\'' +
                ", running_time='" + running_time + '\'' +
                ", rt_score='" + rt_score + '\'' +
                ", species=" + species +
                ", locations=" + locations +
                ", vehicles=" + vehicles +
                ", url='" + url + '\'' +
                '}';
    }
}
