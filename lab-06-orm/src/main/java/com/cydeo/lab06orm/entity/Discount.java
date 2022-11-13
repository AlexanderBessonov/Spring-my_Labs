package com.cydeo.lab06orm.entity;

import com.cydeo.lab06orm.enums.DiscountType;
import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Discount extends BaseEntity{

    private double discount;

    @NotNull
    @Enumerated(EnumType.STRING)
    private DiscountType discountType;
    private String name;

    @OneToMany//(fetch = FetchType.LAZY)
    @JoinColumn(name = "cart_id")
    private List<Cart> carts;
}
