package com.cydeo.lab07ormqueries.repository;

import com.cydeo.lab06orm.entity.Address;
import com.cydeo.lab06orm.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AddressRepository extends JpaRepository {
    //Write a derived query to get all address with a specific customer
    List<Address> findAllByCustomer (Customer customer);
    //Write a derived query to get address with a specific street
    List<Address> findAllByStreet (String street);
    //Write a derived query to get top 3 address with a specific customer email
    List<Address> find3TopByEmail(String email);
    //Write a derived query to get all address with a specific customer and name
    List<Address> find3TopByCustomerAndName(Customer customer, String name);
    //Write a derived query to list all address where the beginning of the street contains the keyword
    List<Address> findAllByStreetStartingWith(String keyword);
    //Write a JPQL query to get all address with a specific customerId
    @Query("SELECT  a FROM Address  a where a.customerId")
    List<Address> fetchAllByCustomerID();
}
