package com.mohamadou.concertticketsales.model.customers;

import com.mohamadou.concertticketsales.model.concerts.BaseEntity;
import lombok.*;

import javax.persistence.Entity;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Customer extends BaseEntity {
    private String customerName;
    private String email;
    private String password;
    private String confirmationCode;
    private String confirmationTime;
}
