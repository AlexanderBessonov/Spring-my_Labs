package com.cydeo.lab06orm.entity;

import com.cydeo.lab06orm.enums.DiscountType;
import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Discount extends BaseEntity{

    private String name;

    private BigDecimal discount;


    @Enumerated(EnumType.STRING)
    private DiscountType discountType;

}
