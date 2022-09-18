package com.cydeo;


import com.cydeo.loosely.BalanceManager;

import java.math.BigDecimal;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        UUID user = UUID.randomUUID();

        Balance customerBalance = new CustomerBalance(user, BigDecimal.ZERO);
        Balance giftCardBalance = new GiftCardBalance(user, BigDecimal.ZERO);

        customerBalance.addBalance(new BigDecimal(150));
        giftCardBalance.addBalance(new BigDecimal(120));

        BalanceManager balanceService2 =
                new BalanceManager(customerBalance);

        BalanceManager balanceService =
                new BalanceManager( giftCardBalance);

        System.out.println(balanceService.checkout(new BigDecimal(80)));
        System.out.println(balanceService.checkout(new BigDecimal(80)));


    }

}
