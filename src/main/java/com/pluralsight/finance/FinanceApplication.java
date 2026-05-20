package com.pluralsight.finance;

public class FinanceApplication {
    public static void main(String[] args) {
        CheckingAccount account1 = new CheckingAccount( "Pam", "123", 12500);
        Valuable account2 = new CheckingAccount("Gary", "456", 1500);
// try to deposit money into both accounts
        account1.deposit(100);
        System.out.println(account1.getValue());
    }
}
