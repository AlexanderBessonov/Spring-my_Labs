package com.cydeo.lab07ormqueries.repository;


import com.cydeo.lab06orm.entity.Balance;
import com.cydeo.lab06orm.entity.Customer;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BalanceRepository {
    //Write a derived query to check balance exists for specific customer
     List<Balance>  findAllByCustomer (Customer customer);
    //Write a derived query to get balance for specific customer
    Double getByCustomer (Customer customer);
    //Write a native query to get top 5 max balance
    @Query(value = "SELECT max(*) FROM balance order by balance",nativeQuery = true)
    List<Balance> retrieveTop5MaxBalance();
    //Write a derived query to get all balances greater than or equal specific balance amount
    List<Balance> getAllBy(Double amount);
    //Write a native query to get all balances less than specific balance amount
    @Query(value = "SELECT * FROM balance order by balance",nativeQuery = true)
    List<Balance> retrieveAllBalanceLessThan();
}
