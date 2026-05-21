package com.pluralsight.finance;

import java.util.Scanner;

public class FinanceApplication {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        CheckingAccount account1 = new CheckingAccount("Pam", "123", 12500);
        Valuable account2 = new CheckingAccount("Gary", "456", 1500);
// try to deposit money into both accounts
        account1.deposit(100);
        System.out.println(account1.getValue());


        Portfolio portfolio = new Portfolio("My Portfolio", "Jolie");

        boolean running = true;

        while (running) {

            System.out.println("""
                    1. Checking Account
                    2. Credit Card
                    3. Gold
                    4. Jewelry
                    5. House
                    0. Exit
                    Choose asset type:
                    """);

            int choice = input.nextInt();
            input.nextLine();
            switch (choice) {
                case 1 -> {
                    System.out.print("Name of bank account: ");
                    String name = input.nextLine();
                    System.out.print("Account Number: ");
                    String accountNumber = input.nextLine();
                    System.out.print("Balance: ");
                    double balance = input.nextDouble();
                    input.nextLine();
                    portfolio.add(new CheckingAccount(name, accountNumber, balance));
                }

                case 2 -> {
                    System.out.print("Name of credit card: ");
                    String name = input.nextLine();
                    System.out.print("Account Number: ");
                    String accountNumber = input.nextLine();
                    System.out.print("Balance: ");
                    double balance = input.nextDouble();
                    input.nextLine();
                    portfolio.add(new CreditCard(name, accountNumber, balance));
                }

                case 3 -> {
                    String name = "Gold";
                    System.out.print("Market Value: ");
                    double marketValue = input.nextDouble();
                    System.out.print("Weight: ");
                    double weight = input.nextDouble();
                    input.nextLine();
                    portfolio.add(new Gold(name, marketValue, weight));
                }

                case 4 -> {
                    System.out.print("Name of jewelry: ");
                    String name = input.nextLine();
                    System.out.print("Market Value: ");
                    double marketValue = input.nextDouble();
                    System.out.print("Karat: ");
                    double karat = input.nextDouble();
                    input.nextLine();
                    portfolio.add(new Jewelry(name, marketValue, karat));
                }

                case 5 -> {
                    System.out.print("Address of house: ");
                    String name = input.nextLine();
                    System.out.print("Market Value: ");
                    double marketValue = input.nextDouble();
                    System.out.print("Year Built: ");
                    int yearBuilt = input.nextInt();
                    System.out.print("Square Feet: ");
                    int squareFeet = input.nextInt();
                    System.out.print("Bedrooms: ");
                    int bedrooms = input.nextInt();
                    input.nextLine();
                    portfolio.add(new House(name, marketValue, yearBuilt, squareFeet, bedrooms));
                }

                case 0 -> running = false;
                default -> System.out.println("Invalid choice");
            }
        }

        System.out.println("\nTotal Portfolio Value: " + portfolio.getValue());


        System.out.println("Least Valuable Asset: " + portfolio.getLeastValuable());

        System.out.println("Most Valuable Asset: " + portfolio.getMostValueable());
    }

}
