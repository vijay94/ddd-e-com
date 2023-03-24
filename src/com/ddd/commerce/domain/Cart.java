package com.ddd.commerce.domain;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Item> items;

    public Cart() {
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        this.items.add(item);
    }

    public void removeItem(String name) {
        items.removeIf(item -> item.getProduct().getName().equals(name));
    }
}
