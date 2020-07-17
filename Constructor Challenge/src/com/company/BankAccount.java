package com.company;

public class BankAccount {

    private int accountNumber;
    private int balance;
    private String customerName;
    private String customerEmail;
    private int phoneNumber;

    public BankAccount(int accountNumber, int balance, String customerName, String customerEmail, int phoneNumber ){
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.phoneNumber = phoneNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void depositFunds(int amount){

        this.balance += amount;
        System.out.println("New Balance: " + balance);
    }

    public void withdrawFunds(int amount){

        if(this.balance >= amount){

            this.balance -= amount;
            System.out.println("New Balance: " + balance);
        }

        else {
            System.out.println("Insufficient Funds");
        }
    }
}
