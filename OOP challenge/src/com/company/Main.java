package com.company;

public class Main {

    public static void main(String[] args) {

        Hamburger hamburger = new Hamburger("Basic","Sausage",100,"white" );
        hamburger.addHamburgerAddition1("lettuce",50);
        hamburger.addHamburgerAddition2("mayo",25);
        hamburger.addHamburgerAddition3("pickle",25);
        hamburger.addHamburgerAddition4("tomato",25);
        System.out.println("Total burger price is: " + hamburger.itemizeHamburger());

        HealthyBurger healthyBurger = new HealthyBurger("Beacon", 150);
        healthyBurger.addHealthyAddition1("egg", 50);
        healthyBurger.addHealthyAddition2("lentils", 50);
        System.out.println("Total cost of healthy burger is: " + healthyBurger.itemizeHamburger());

        DeluxeBurger deluxeBurger = new DeluxeBurger();
        deluxeBurger.itemizeHamburger();
    }
}
