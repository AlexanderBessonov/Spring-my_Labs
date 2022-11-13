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
@Table(name = "table")
public class Cart extends BaseEntity{

   @NotNull
   @Enumerated(EnumType.STRING)
   private CartState cartState;
   private Integer customerId;
   private Integer discountId;

   @ManyToOne(fetch = FetchType.LAZY)
  // @JoinColumn(name = "discount_id")
   private Discount discount;

   @ManyToOne(fetch = FetchType.LAZY)
  // @JoinColumn(name = "customer_id")
   private Customer customer;

}
