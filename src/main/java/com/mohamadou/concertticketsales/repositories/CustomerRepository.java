package com.mohamadou.concertticketsales.repositories;

import com.mohamadou.concertticketsales.model.customers.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}