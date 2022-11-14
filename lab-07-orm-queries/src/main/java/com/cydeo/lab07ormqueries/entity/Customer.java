package com.cydeo.lab07ormqueries.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Customer extends BaseEntity {


   private String email;

   private String firstName;

   private String lastName;

   private String userName;


}
