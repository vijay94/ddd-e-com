package com.ddd.commerce.application;

import com.ddd.commerce.domain.Cart;
import com.ddd.commerce.domain.Item;
import com.ddd.commerce.domain.Product;

public class Main {
    public static void main(String[] args) {
        Product applePencil = new Product("Apple Pencil");
        Product sonyHeadSet = new Product("Sony Wireless headphone");
        Cart cart = new Cart();
        Item applePencilItem = new Item(applePencil, 2);
        Item sonyHeadPhoneItem = new Item(sonyHeadSet, 1);
        cart.addItem(applePencilItem);
        cart.addItem(sonyHeadPhoneItem);
    }
}