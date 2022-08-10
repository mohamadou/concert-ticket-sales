package com.mohamadou.concertticketsales.model.concerts;

import com.mohamadou.concertticketsales.model.BaseEntity;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/*Genre table. It stores a list of all the musical genres of our concerts.
This allows customers to search for tickets in their preferred genre*/

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "genres")
public class Genre extends BaseEntity {
    @Column(name = "genre_name")
    private String genreName;
}
