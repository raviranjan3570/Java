package com.company;

public class Main {

    public static void main(String[] args) {

        char switchValue = 'A';

        switch (switchValue){
            case 'A':
                System.out.println("Value was A");
                break;

            case 'B':
                System.out.println("Value was B");

            case 'C':
                System.out.println("Value wa C");

            case 'D':
                System.out.println("Value was D");

            case 'E':
                System.out.println("Value was E");

            default:
                System.out.println("Was not A,B,C,D or E");
        }
    }
}
