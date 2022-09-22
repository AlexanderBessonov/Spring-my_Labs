package com.cydeo.loosely;

import com.cydeo.Balance;
import lombok.AllArgsConstructor;

import java.math.BigDecimal;
@AllArgsConstructor
public class BalanceManager {

   private final Balance balance;



    public boolean checkout(Balance balance, BigDecimal checkoutAmount
                            // add method parameters
    ){
        // implement checkout business
        BigDecimal balanceAmount = balance.getAmount();
       return balanceAmount.subtract(checkoutAmount).compareTo(BigDecimal.ZERO) > 0;



    }
}
