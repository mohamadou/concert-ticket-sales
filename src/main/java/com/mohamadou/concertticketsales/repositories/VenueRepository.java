package com.mohamadou.concertticketsales.repositories;

import com.mohamadou.concertticketsales.model.concerts.Venue;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VenueRepository extends JpaRepository<Venue, Long> {
}