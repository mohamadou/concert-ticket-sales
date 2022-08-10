package com.mohamadou.concertticketsales.model.concerts;

import com.mohamadou.concertticketsales.model.BaseEntity;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Table;

/*This table will contain information about the venue where the concert is being held. */

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Getter
@Setter
@Table(name = "venues")
public class Venue extends BaseEntity {
    private String venue_name;
    private String location;
    private String type;
    private Integer capacity;
}
