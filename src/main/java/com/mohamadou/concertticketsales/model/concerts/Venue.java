package com.mohamadou.concertticketsales.model.concerts;

import lombok.*;

import javax.persistence.Entity;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Getter
@Setter
public class Venue extends BaseEntity{
    private String venue_name;
    private String location;
    private String type;
    private Integer capacity;
}
