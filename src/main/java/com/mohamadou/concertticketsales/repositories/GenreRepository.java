package com.mohamadou.concertticketsales.repositories;

import com.mohamadou.concertticketsales.model.concerts.Genre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GenreRepository extends JpaRepository<Genre, Long> {
}