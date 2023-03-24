package com.ddd.commerce.domain.bank;

public class Account {

    private String accountNumber;

    private Address address;


    public Account(String accountNumber, Address address) {
        this.accountNumber = accountNumber;
        this.address = address;
    }

    protected void setAddress(Address address) {
        this.address = address;
    }
}
