package com.mohamadou.concertticketsales.model.concerts;

import com.mohamadou.concertticketsales.model.BaseEntity;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "artists")
public class Artist extends BaseEntity {
    private String artist_name;

    @ManyToOne
    @JoinColumn(name = "genre_id")
    private Genre genre;
}
