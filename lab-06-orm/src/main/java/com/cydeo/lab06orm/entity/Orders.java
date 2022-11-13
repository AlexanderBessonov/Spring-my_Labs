package com.cydeo.lab06orm.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Orders extends BaseEntity{
   private Double paidPrice;
   private Double totalPrice;


   @ManyToOne//(fetch = FetchType.LAZY)
   @JoinColumn(name = "customer_id")
   private Customer customer;


   @OneToOne//(cascade = CascadeType.ALL)
   @JoinColumn(name = "cart_id")
   private Cart cart;

   @OneToOne//(cascade = CascadeType.ALL)
   @JoinColumn(name = "payment_id")
   private Payment payment;

}
