package com.cydeo.lab07ormqueries.repository;
import com.cydeo.lab06orm.entity.Cart;
import com.cydeo.lab06orm.entity.CartItem;
import com.cydeo.lab06orm.entity.Customer;
import com.cydeo.lab06orm.enums.CartState;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CartRepository {
    //Write a derived query to get all cart by specific discount type
    List<Cart> findAllByDiscountWhere (CartState cartState);
    //Write a JPQL query to get all cart by customer
    @Query("SELECT c from Cart c WHERE c.customer=?1")
    Optional<Cart> fetchAllCartByCustomer(@Param("customer") Customer customer);
    //Write a derived query to get all cart by customer and cart state

    //Write a derived query to get all cart by customer and cart state and discount is null condition

    //Write a native query to get all cart by customer and cart state and discount is not null condition

}
