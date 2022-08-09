package com.mohamadou.concertticketsales.model.orders;

import com.mohamadou.concertticketsales.model.concerts.BaseEntity;
import com.mohamadou.concertticketsales.model.customers.Customer;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Order extends BaseEntity {

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
