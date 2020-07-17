package com.company;

public class DeluxeBurger extends Hamburger {


    public DeluxeBurger() {
        super("Deluxe", "Sausage and beacon", 500, "White");
        super.addHamburgerAddition1("Chips", 50);
        super.addHamburgerAddition2("Drinks", 100);
    }

    @Override
    public void addHamburgerAddition1(String Name, double price) {
        System.out.println("Cannot add additional item to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition2(String Name, double price) {
        System.out.println("Cannot add additional item to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition3(String Name, double price) {
        System.out.println("Cannot add additional item to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition4(String Name, double price) {
        System.out.println("Cannot add additional item to a deluxe burger");
    }
}
