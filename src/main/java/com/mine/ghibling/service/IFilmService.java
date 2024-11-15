package com.mine.ghibling.service;

import com.mine.ghibling.model.Films;

public interface IFilmService {
    Films[] fetchDataAndSave();
}