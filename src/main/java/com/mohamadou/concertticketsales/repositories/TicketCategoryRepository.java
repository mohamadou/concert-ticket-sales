package com.mohamadou.concertticketsales.repositories;

import com.mohamadou.concertticketsales.model.tickets.TicketCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketCategoryRepository extends JpaRepository<TicketCategory, Long> {
}