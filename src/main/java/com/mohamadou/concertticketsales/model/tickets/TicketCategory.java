package com.mohamadou.concertticketsales.model.tickets;

import com.mohamadou.concertticketsales.model.concerts.BaseEntity;
import com.mohamadou.concertticketsales.model.concerts.Concert;
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
public class TicketCategory extends BaseEntity {
    private String description;
    private Float price;
    private LocalDate startDate;
    private LocalDate endDate;
    private String area;

    @ManyToOne
    @JoinColumn(name = "concert_id")
    private Concert concert;
}