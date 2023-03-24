package com.ddd.commerce.domain.bank;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;

    private List<Account> accounts;

    private Address address;


    public Customer(String name, Address address) {
        this.name = name;
        this.address = address;
        this.accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        this.accounts.add(account);
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
        this.accounts.forEach(account -> account.setAddress(address));
    }
}
