package com.cydeo.lab06orm.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "customer")
public class Customer extends BaseEntity{


   private String email;

   private String firstName;

   private String lastName;

   private String userName;

   @OneToOne(cascade = CascadeType.ALL)
   @JoinColumn(name = "balance_id2")
   private Balance balance;

   @OneToMany//(cascade = CascadeType.ALL)
   @JoinColumn(name = "address_id")
   private List<Address> address;

   @OneToMany//(cascade = CascadeType.ALL)
   @JoinColumn(name = "orders_id")
   private List<Orders> orders;

   @OneToMany//(cascade = CascadeType.ALL)
   @JoinColumn(name = "carts_id")
   private List<Cart> carts;
}
