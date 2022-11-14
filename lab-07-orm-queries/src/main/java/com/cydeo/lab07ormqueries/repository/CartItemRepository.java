package com.cydeo.lab07ormqueries.repository;


import com.cydeo.lab06orm.entity.Balance;
import com.cydeo.lab06orm.entity.CartItem;
import com.cydeo.lab06orm.enums.CartState;
import com.cydeo.lab06orm.enums.DiscountType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CartItemRepository extends JpaRepository<CartItem,Long> {

    //Write a derived query to get count cart items
    Integer countAllBy ();
    Integer countCartItemBy ();
    //Write a derived query to get cart items for specific cart state
    List<CartItem> findAllByCart_CartState(CartState cartState);

    //Write a native query to get cart items for specific cart state and product name
    @Query(value = "SELECT * FROM cart_item ci  join cart c ON ci.cart_id  = c.id"+
               " JOIN product p ON ci.product_id = p.id  Where c.cart_state = ?1 AND p.name =?2",nativeQuery = true)
    List<CartItem> retrieveCartItemsByCartStateAndProductName(@Param("cartState") String cartState, @Param("name") String name);

    //Write a native query to get cart items for specific cart state and without discount
    @Query(value = "SELECT * FROM cart_item ci join cart c ON ci.cart_id  = c.id   " +
            "  Where c.cart_state = ?1 AND c.discount IS NULL",nativeQuery = true)
    List<CartItem> retrieveCartItemsByCartStateWithoutDiscount(@Param("cartState") String cartState);

    //Write a native query to get cart items for specific cart state and with specific Discount type
    @Query(value = "SELECT * FROM cart_item ci join cart c ON ci.cart_id  = c.id" +
            "            join discount d ON c.discount_id  = d.id Where c.cart_state = ?1 AND d.discount_type = ?2",nativeQuery = true)
    List<CartItem> retrieveCartItemsByCartStateAndDiscountType(@Param("cartState") String cartState, @Param("discountType") String discountType);
}
