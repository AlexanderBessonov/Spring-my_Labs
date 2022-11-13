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
public class Cart extends BaseEntity{

   @Enumerated(EnumType.STRING)
   private CartState cartState;

   @ManyToOne
   private Discount discount;

   @ManyToOne
   private Customer customer;

}
