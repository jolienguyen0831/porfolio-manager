package com.pluralsight.finance;

public class CheckingAccount extends Account {
    public CheckingAccount(String name, String accountNumber, double balance) {
        super(name, accountNumber, balance);
    }
    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    @Override
    public double getValue() {
        return balance;
    }


}
