package com.cydeo.loosely;

import com.cydeo.Balance;

import java.math.BigDecimal;

public class BalanceManager {

    Balance balance;

    public BalanceManager(Balance balance) {
        this.balance = balance;
    }

    public boolean checkout(BigDecimal checkoutAmount
                            // add method parameters
    ){
        // implement checkout business
        BigDecimal customerBalanceAmount = balance.getAmount();
       return customerBalanceAmount.subtract(checkoutAmount).compareTo(BigDecimal.ZERO) > 0;



    }
}
