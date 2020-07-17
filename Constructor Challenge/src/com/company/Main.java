package com.company;

public class Main {

    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount(2030690941, 5000, "Ravi", "raviranjan3570@gmail.com", 950482625);
        System.out.println(bankAccount.getAccountNumber());
        System.out.println(bankAccount.getBalance());
        System.out.println(bankAccount.getBalance());
        System.out.println(bankAccount.getCustomerName());
        System.out.println(bankAccount.getCustomerEmail());
        System.out.println(bankAccount.getPhoneNumber());
        bankAccount.withdrawFunds(1000);
        bankAccount.depositFunds(1000);
        VipCustomer vipCustomer = new VipCustomer("Ravi");
        System.out.println(vipCustomer.getName());
        System.out.println(vipCustomer.getCreditLimit());
        System.out.println(vipCustomer.getEmailAddress());
    }
}
