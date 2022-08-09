package com.mohamadou.concertticketsales.model.concerts;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;

@Builder
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Artist extends BaseEntity{
    private String artist_name;

    //TODO add genre
}
