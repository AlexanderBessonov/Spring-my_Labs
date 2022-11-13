package com.cydeo.lab06orm.enums;

public enum DiscountType {
    RATE_BASED("Rate_Based"), AMOUNT_BASED("Amount_Based");

    private final String value;

    DiscountType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
