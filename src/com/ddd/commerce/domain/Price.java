package com.ddd.commerce.domain;

import java.util.Currency;

public class Price {
    private float amount;
    private Currency currency;
    public Price(float amount, Currency currency) {
        this.amount = amount;
        this.currency = currency;
    }
}
