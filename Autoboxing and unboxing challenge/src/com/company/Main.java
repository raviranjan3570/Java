package com.company;

public class Main {

    public static void main(String[] args) {

        Bank bank = new Bank("SBI");
        bank.addBranch("PATNA");
        bank.addCustomer("PATNA", "RAVI", 500.00);
        bank.addCustomer("PATNA", "AMANI", 1500.00);
        bank.addCustomer("PATNA", "SAUMYA", 3000.00);
        bank.addBranch("GAYA");
        bank.addCustomer("GAYA", "TIM", 6000.00);
        bank.addCustomerTransactions("PATNA", "RAVI", 500.00);
        bank.addCustomerTransactions("PATNA", "SAUMYA", 1000.00);
        bank.listCustomer("PATNA", true);
    }
}
