package com.ddd.commerce.application;

import com.ddd.commerce.domain.*;
import com.ddd.commerce.domain.bank.Account;
import com.ddd.commerce.domain.bank.Address;
import com.ddd.commerce.domain.bank.Customer;
import com.ddd.commerce.domain.service.CompetitorPriceCalculator;

import java.util.ArrayList;
import java.util.Currency;
import java.util.HashMap;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        var prices = new HashMap<String, Price>();
        prices.put("Apple Pencil", new Price(250f, Currency.getInstance("EUR")));
        prices.put("Sony Wireless headphone", new Price(100f, Currency.getInstance("EUR")));
        CompetitorPriceCalculator competitorPriceCalculator = new CompetitorPriceCalculator(prices);

        Price applePencilPrice = competitorPriceCalculator.getDiscountedPrice("Apple Pencil", new Price(300f, Currency.getInstance("EUR")));
        Product applePencil = new Product("Apple Pencil", applePencilPrice);

        Price sonyHeadPhonePrice = competitorPriceCalculator.getDiscountedPrice("Sony Wireless headphone", new Price(200f, Currency.getInstance("EUR")));
        Product sonyHeadSet = new Product("Sony Wireless headphone", sonyHeadPhonePrice);

        Cart cart = new Cart();
        Item applePencilItem = new Item(applePencil, 2);
        Item sonyHeadPhoneItem = new Item(sonyHeadSet, 1);
        cart.addItem(applePencilItem);
        cart.addItem(sonyHeadPhoneItem);


        cart.checkOut();
        List<Product> checkedOutProducts = cart.getCheckedOutProducts();
        Order order = new Order(checkedOutProducts);


        Customer customer = new Customer("Fabiana", new Address("Spain street", "spain"));
        customer.addAccount(new Account("ACC_1", customer.getAddress()));

        customer.setAddress(new Address("Spain street", "brazil"));
        // 2,000
    }
}