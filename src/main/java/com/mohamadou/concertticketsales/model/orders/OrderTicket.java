package com.mohamadou.concertticketsales.model.orders;

import com.mohamadou.concertticketsales.model.BaseEntity;
import com.mohamadou.concertticketsales.model.tickets.Ticket;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@AllArgsConstructor
@Builder
@NoArgsConstructor
@Table(name = "order_tickets")
public class OrderTicket extends BaseEntity {
    @ManyToOne
    @JoinColumn(name = "order_id")
    private CustomerOrder order;

    @ManyToOne
    @JoinColumn(name = "ticket_id")
    private Ticket ticket;
}
