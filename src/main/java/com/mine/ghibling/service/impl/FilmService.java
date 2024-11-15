package com.mine.ghibling.service.impl;

import com.mine.ghibling.model.Films;
import com.mine.ghibling.repository.FilmRepository;
import com.mine.ghibling.service.IFilmService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

@Service
@Slf4j
public class FilmService implements IFilmService {

    private final RestTemplate restTemplate;
    private final FilmRepository filmRepository;

    public FilmService(RestTemplate restTemplate, FilmRepository filmRepository) {
        this.filmRepository = filmRepository;
        this.restTemplate = restTemplate;
    }

    @Override
    public Films[] fetchDataAndSave() {
        // Call the external API
        String apiUrl = "https://ghibli.rest/films";
        ResponseEntity<Films[]> response = restTemplate.getForEntity(apiUrl, Films[].class);
        log.info(String.valueOf(response));
        // Process the API response
        Films[] films = null;
        if (response.getStatusCode() == HttpStatus.OK) {
            films = response.getBody();
            log.info(Arrays.toString(films));

            if (films != null) {
                for (Films data : films) {
                    Films film = new Films();
                    film.setFilm_id(data.getFilm_id());
                    film.setTitle(data.getTitle());
                    film.setOriginal_title(data.getOriginal_title());
                    film.setOriginal_title_romanised(data.getOriginal_title_romanised());
                    film.setImage(data.getImage());
                    film.setMovie_banner(data.getMovie_banner());
                    film.setDescription(data.getDescription());
                    film.setDirector(data.getDirector());
                    film.setProducer(data.getProducer());
                    film.setRelease_date(data.getRelease_date());
                    film.setRunning_time(data.getRunning_time());
                    film.setRt_score(data.getRt_score());
                    film.setUrl(data.getUrl());
                    log.info(film.toString());
                    filmRepository.save(film);
                }
            }
        }
        return films;
    }
}
