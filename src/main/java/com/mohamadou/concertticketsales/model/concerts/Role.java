package com.mohamadou.concertticketsales.model.concerts;

import lombok.*;

import javax.persistence.Entity;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Role extends BaseEntity{
    private String role_name;
}
