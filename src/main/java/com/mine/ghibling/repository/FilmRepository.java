package com.mine.ghibling.repository;

import com.mine.ghibling.model.Films;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FilmRepository extends JpaRepository<Films, Integer> {

}
