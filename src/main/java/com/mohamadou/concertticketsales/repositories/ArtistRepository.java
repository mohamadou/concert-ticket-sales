package com.mohamadou.concertticketsales.repositories;

import com.mohamadou.concertticketsales.model.concerts.Artist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArtistRepository extends JpaRepository<Artist, Long> {
}