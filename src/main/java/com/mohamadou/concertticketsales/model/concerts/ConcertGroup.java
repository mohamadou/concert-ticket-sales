package com.mohamadou.concertticketsales.model.concerts;

import lombok.*;

import javax.persistence.Entity;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ConcertGroup extends BaseEntity{
    private String name;
}
