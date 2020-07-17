package com.example.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter the number: ");
        X x = new X(scanner.nextInt());
        x.x();
    }
}
