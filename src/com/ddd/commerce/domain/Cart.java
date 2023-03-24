package com.ddd.commerce.domain;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Item> items;
    private List<String> removedProducts;

    private boolean checkedOut;

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

    public void checkOut() {
        this.checkedOut = true;
    }

    public List<Item> getItems() {
        return items;
    }

    public List<Product> getCheckedOutProducts() {
        List<Product> checkedOutProducts = new ArrayList<>();
        items.forEach(item -> {
            for (int i = 0; i < item.getQuantity(); i++) {
                checkedOutProducts.add(item.getProduct());
            }
        });
        return checkedOutProducts;
    }
}
