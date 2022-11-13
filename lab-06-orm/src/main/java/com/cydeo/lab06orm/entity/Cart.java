package com.cydeo.lab06orm.entity;

import com.cydeo.lab06orm.enums.CartState;
import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "cart")
public class Cart extends BaseEntity{


   @Enumerated(EnumType.STRING)
   private CartState cartState;


   @ManyToOne(fetch = FetchType.LAZY)
   @JoinColumn(name = "discount_id")
   private Discount discount;

   @ManyToOne(fetch = FetchType.LAZY)
   @JoinColumn(name = "customer_id")
   private Customer customer;

}
