package com.mine.ghibling.controller;

import com.mine.ghibling.model.Films;
import com.mine.ghibling.service.IFilmService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;

@RequestMapping("/films")
@RestController
@Slf4j
public class FilmsController {

    private final IFilmService filmService;

    public FilmsController(IFilmService filmService) {
        this.filmService = filmService;
    }

    @PostMapping("/create")
    @PreAuthorize("isAuthenticated()")
    public ResponseEntity<Films[]> addFilms() {
        log.info("Entering create films api");
        Films[] films = filmService.fetchDataAndSave();
        log.info(Arrays.toString(films));
        return ResponseEntity.ok(films);
    }
}
