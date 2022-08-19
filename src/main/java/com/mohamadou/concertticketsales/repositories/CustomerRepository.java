package com.mohamadou.concertticketsales.repositories;

import com.mohamadou.concertticketsales.model.customers.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}