package com.cydeo.lab07ormqueries.repository;

import com.cydeo.lab06orm.entity.Cart;
import com.cydeo.lab07ormqueries.entity.Category;
import com.cydeo.lab07ormqueries.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long> {

    //Write a derived query to get all customer by id
    Optional<Customer>  findById(Long id); //Optional - Is that in case there is no customer

    //Write a JPQL query to get customer by email
    @Query("SELECT c from Customer c WHERE c.email=?1")
    Customer retrieveByCustomerEmail(String email);

}
