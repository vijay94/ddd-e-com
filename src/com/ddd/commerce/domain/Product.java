package com.ddd.commerce.domain;

public class Product {
    private Price price;
    private String name;
    public Product(String name, Price price) {
        this.name = name;
        this.price = price;
    }

    public Product(String productName) {
        this.name = productName;

    }

    public String getName() {
        return name;
    }

    public void setPrice(Price price) {
        this.price = price;
    }
}
