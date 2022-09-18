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
    public Currency currency(){
      return new Currency("1","Dollar");
    }
    @Bean
    public Current current(){
        Current current = new Current();
                current.setCurrency(currency());
                current.setAmount(BigDecimal.TEN);
                current.setAccountId(UUID.randomUUID());
                return current;
    }
    @Bean
    public Saving saving(){
        Saving saving = new Saving();

        saving.setCurrency(currency());
        saving.setAmount(BigDecimal.ONE);
        saving.setAccountId(UUID.randomUUID());
        return saving;
    }

}
