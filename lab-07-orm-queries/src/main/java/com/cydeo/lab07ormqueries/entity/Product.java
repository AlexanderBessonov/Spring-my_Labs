package com.cydeo.lab07ormqueries.entity;
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
public class Product extends BaseEntity {

    private String name;
    private BigDecimal price;
    private Integer quantity;
    private Integer remainingQuantity;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name="product_category_rel",
            joinColumns = @JoinColumn(name="p_id"),
            inverseJoinColumns = @JoinColumn(name="c_id"))

    private List<Category> categoryList;


}