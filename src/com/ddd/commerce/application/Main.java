package com.ddd.commerce.application;

import com.ddd.commerce.domain.Cart;
import com.ddd.commerce.domain.Item;
import com.ddd.commerce.domain.Price;
import com.ddd.commerce.domain.Product;

import java.util.Currency;

public class Main {
    public static void main(String[] args) {
        Product applePencil = new Product("Apple Pencil", new Price(300f, Currency.getInstance("EUR")));
        Product sonyHeadSet = new Product("Sony Wireless headphone", new Price(200f, Currency.getInstance("EUR")));
        Cart cart = new Cart();
        Item applePencilItem = new Item(applePencil, 2);
        Item sonyHeadPhoneItem = new Item(sonyHeadSet, 1);
        cart.addItem(applePencilItem);
        cart.addItem(sonyHeadPhoneItem);


        // 2,000
    }
}