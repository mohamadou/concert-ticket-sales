package com.mohamadou.concertticketsales.repositories;

import com.mohamadou.concertticketsales.model.tickets.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketRepository extends JpaRepository<Ticket, Long> {
}