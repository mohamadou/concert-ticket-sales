package com.mohamadou.concertticketsales.model.orders;

import com.mohamadou.concertticketsales.model.BaseEntity;
import com.mohamadou.concertticketsales.model.customers.Customer;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@AllArgsConstructor
@Builder
@NoArgsConstructor
@Table(name = "customer_orders")
public class CustomerOrder extends BaseEntity {

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    private LocalDate orderTime;
    private LocalDate timePaid;
    private LocalDate timeSend;
    private Float totalPrice;
    private Float discount;
    private Float finalPrice;
}
