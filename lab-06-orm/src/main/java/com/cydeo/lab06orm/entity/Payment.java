package com.cydeo.lab06orm.entity;

import com.cydeo.lab06orm.enums.PaymentMethod;
import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.OneToOne;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Payment extends BaseEntity{

  private Double  paidPrice;

  @NotNull
  @Enumerated(EnumType.STRING)
  private PaymentMethod paymentMethod;
}
