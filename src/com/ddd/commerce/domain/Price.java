package com.ddd.commerce.domain;

import java.util.Currency;

public class Price {
    private float amount;
    private Currency currency;
    public Price(float amount, Currency currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public float getAmount() {
        return amount;
    }

    public Currency getCurrency() {
        return currency;
    }

    public float reducePriceBy(float percentage) {
        return (this.amount / 100) * (100 - percentage);
    }
}
