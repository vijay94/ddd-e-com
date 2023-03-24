package com.ddd.commerce.domain.service;

import com.ddd.commerce.domain.Price;

import java.util.HashMap;

public class CompetitorPriceCalculator {
    private HashMap<String, Price> competitorPrice;

    public CompetitorPriceCalculator(HashMap<String, Price> priceHashMap) {
        competitorPrice = priceHashMap;
    }

    public Price getDiscountedPrice(String productName, Price ourPrice) {
        Price competitorPrice = this.competitorPrice.get(productName);
        return new Price(competitorPrice.reducePriceBy(10), ourPrice.getCurrency());
    }
}
