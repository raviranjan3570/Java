package com.company;

public class VipCustomer {

    private String name;
    private int creditLimit;
    private String emailAddress;

    public VipCustomer(String name, int creditLimit, String emailAddress){

        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public VipCustomer(String name, int creditLimit){
        this(name, creditLimit, "raviranjan3570@gmail.com");
    }

    public VipCustomer(String name){
        this(name, 5000, "raviranjan3570@gmail.com");
    }

    public String getName() {
        return name;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

}
