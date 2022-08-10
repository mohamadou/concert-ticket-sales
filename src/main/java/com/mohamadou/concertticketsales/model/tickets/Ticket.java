package com.mohamadou.concertticketsales.model.tickets;

import com.mohamadou.concertticketsales.model.BaseEntity;
import com.mohamadou.concertticketsales.model.concerts.Concert;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "tickets")
public class Ticket extends BaseEntity {
    private String serialNumber;

    @ManyToOne
    @JoinColumn(name = "concert_id")
    private Concert concert;

    @ManyToOne
    @JoinColumn(name = "ticket_category_ID")
    private TicketCategory ticketCategory;

    private String seat;

    private LocalDate purchaseDate;

}


