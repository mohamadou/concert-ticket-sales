package com.mohamadou.concertticketsales.repositories;

import com.mohamadou.concertticketsales.model.orders.OrderTicket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderTicketRepository extends JpaRepository<OrderTicket, Long> {
}