package com.mohamadou.concertticketsales.model.customers;

import com.mohamadou.concertticketsales.model.BaseEntity;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "customers")
public class Customer extends BaseEntity {
    private String customerName;
    private String email;
    private String password;
    private String confirmationCode;
    private String confirmationTime;
}
