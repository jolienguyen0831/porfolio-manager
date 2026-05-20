package com.pluralsight.finance;

public abstract class Account implements Valuable {
    protected String name;
    protected String accountNumber;
    protected double balance;

    public Account(String name, String accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public abstract double getValue();


}
