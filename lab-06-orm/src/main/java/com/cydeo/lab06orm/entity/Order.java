package com.cydeo.lab06orm.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "orders")
public class Order extends BaseEntity{

   private BigDecimal paidPrice;
   private BigDecimal totalPrice;

   @ManyToOne
   private Customer customer;

   @OneToOne
   private Cart cart;

   @OneToOne
   private Payment payment;

}
