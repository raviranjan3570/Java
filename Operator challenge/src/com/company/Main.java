package com.company;

public class Main {

    public static void main(String[] args) {
	double firstDouble = 20.00;
	double secondDouble = 80.00;
	double result = (firstDouble + secondDouble) * 100;
	double remainder = (result % 40);
	boolean isTrue = (remainder == 0) ? true : false;
        System.out.println(isTrue);
    }
}
