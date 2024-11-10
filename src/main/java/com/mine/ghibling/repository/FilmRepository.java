package com.mine.ghibling.repository;

import com.mine.ghibling.model.Films;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FilmRepository extends CrudRepository<Films, Integer> {

}
