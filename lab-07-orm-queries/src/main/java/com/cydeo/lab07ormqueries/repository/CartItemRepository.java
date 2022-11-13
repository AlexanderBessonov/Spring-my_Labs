package com.cydeo.lab07ormqueries.repository;


import com.cydeo.lab06orm.entity.CartItem;
import com.cydeo.lab06orm.enums.CartState;
import com.cydeo.lab06orm.enums.DiscountType;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CartItemRepository {

    //Write a derived query to get count cart items
    List<CartItem> findAllByCartState (CartState cartState);

    //Write a derived query to get cart items for specific cart state
    List<CartItem> getAllByCartState(String cartState);

    //Write a native query to get cart items for specific cart state and product name
    @Query(value = "SELECT * FROM cart_item ci JOIN product p ON ci.id = p.id " +
            "            join cart c ON ci.id  = c.id Where name ?1",nativeQuery = true)
    List<CartItem> retrieveCartItemByName(String name);

    //Write a native query to get cart items for specific cart state and without discount
    @Query(value = "SELECT * FROM cart_item ci JOIN product p ON ci.id = p.id " +//?????????????????????????
            "            join cart c ON ci.id  = c.id Where name ?1",nativeQuery = true)
    List<CartItem> retrieveCartItemBySpecificCartState(String name);

    //Write a native query to get cart items for specific cart state and with specific Discount type
    @Query(value = "SELECT * FROM cart_item ci JOIN cart c ON ci.id  = c.id" +
            "            join discount d ON c.id  = d.id Where name ?1",nativeQuery = true)
    List<CartItem> retrieveCartItemBySpecificDiscountType(DiscountType discountType);
}
