package com.cydeo.lab06orm.entity;
import com.cydeo.lab06orm.entity.BaseEntity;
import com.cydeo.lab06orm.entity.Category;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
public class Product extends BaseEntity{
    private String name;
    private Double price;
    private Integer quantity;
    private Integer remainingQuantity;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name="product_category_rel",
            joinColumns = @JoinColumn(name="p_id"),
            inverseJoinColumns = @JoinColumn(name="c_id"))

    private List<Category> category;


}