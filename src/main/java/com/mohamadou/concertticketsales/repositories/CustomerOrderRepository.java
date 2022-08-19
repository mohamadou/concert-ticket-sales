package com.mohamadou.concertticketsales.repositories;

import com.mohamadou.concertticketsales.model.orders.CustomerOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerOrderRepository extends JpaRepository<CustomerOrder, Long> {
}