package com.company;

public class Main {

    public static void main(String[] args) {
	Printer printer  = new Printer(50, true);
        System.out.println("Initial Page count = " + printer.getPagesPrinted());
        int pagesPrinted = printer.printPages(5);
        System.out.println("pages printed was " + pagesPrinted + " new total print count for printer = " + printer.getPagesPrinted());
    }
}
