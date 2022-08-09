package com.mohamadou.concertticketsales.model.orders;

import com.mohamadou.concertticketsales.model.concerts.BaseEntity;
import com.mohamadou.concertticketsales.model.tickets.Ticket;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OrderTicket extends BaseEntity {
    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;

    @ManyToOne
    @JoinColumn(name = "ticket_id")
    private Ticket ticket;
}
