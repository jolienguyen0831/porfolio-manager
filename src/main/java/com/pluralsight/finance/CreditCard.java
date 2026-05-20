package com.pluralsight.finance;

public class CreditCard extends Account{
    public CreditCard(String name, String accountNumber, double balance) {
        super(name, accountNumber, balance);
    }
    public void charge(double amount){
        balance -= amount;
    }
    public void withdraw ( double amount){
        balance -= amount;
    }

    @Override
    public double getValue() {
        return 0;
    }
}
