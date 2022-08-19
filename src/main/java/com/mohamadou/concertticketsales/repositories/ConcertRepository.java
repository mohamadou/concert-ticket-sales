package com.mohamadou.concertticketsales.repositories;

import com.mohamadou.concertticketsales.model.concerts.Concert;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConcertRepository extends JpaRepository<Concert, Long> {
}