package com.mohamadou.concertticketsales.model.tickets;

import com.mohamadou.concertticketsales.model.BaseEntity;
import com.mohamadou.concertticketsales.model.concerts.Concert;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "ticket_categories")
public class TicketCategory extends BaseEntity {
    @Column(name="description")
    private String description;

    @Column(name="price")
    private Float price;

    @Column(name="start_date")
    private LocalDate startDate;

    @Column(name = "end_date")
    private LocalDate endDate;

    @Column(name="area")
    private String area;

    @ManyToOne
    @JoinColumn(name = "concert_id")
    private Concert concert;
}