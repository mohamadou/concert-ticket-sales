package com.mohamadou.concertticketsales.repositories;

import com.mohamadou.concertticketsales.model.orders.OrderTicket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderTicketRepository extends JpaRepository<OrderTicket, Long> {
}