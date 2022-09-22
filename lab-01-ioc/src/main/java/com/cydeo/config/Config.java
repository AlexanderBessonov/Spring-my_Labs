package com.cydeo.config;

import com.cydeo.Currency;
import com.cydeo.account.Current;
import com.cydeo.account.Saving;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.math.BigDecimal;
import java.util.UUID;

@Configuration
public class Config {

    @Bean
    public Currency currencyBean(){
        return new Currency("DLR","Dollar");
    }
    @Bean
    public Current currentBean(Currency currency){
        Current current = Current( currency);
                current.setCurrency(current));
                current.setAmount(new BigDecimal("500"));
                current.setAccountId(UUID.randomUUID());
                return current;
    }
    @Bean
    public Saving savingBeen(){
        Saving saving = new Saving();

        saving.setCurrency(new Currency("DLR","Dollar"));
        saving.setAmount(new BigDecimal("500"));
        saving.setAccountId(UUID.randomUUID());
        return saving;
    }

}
