package com.ddd.commerce.domain;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Item> items;
    private List<String> removedProducts;

    public Cart() {
        this.items = new ArrayList<>();
        this.removedProducts = new ArrayList<>();
    }

    public void addItem(Item item) {
        this.items.add(item);
    }

    public void removeItem(Product product) {
        if (items.removeIf(item -> item.getProduct().equals(product))) {
            this.removedProducts.add(product.getName());
        }

    }

    public List<String> getRemovedProducts() {
        return removedProducts;
    }
}
