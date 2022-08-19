package com.mohamadou.concertticketsales.repositories;

import com.mohamadou.concertticketsales.model.tickets.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<Ticket, Long> {
}