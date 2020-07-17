package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean isFirstNumber = true;

        int min = 0;
        int max = 0;

        while (true){
            System.out.println("Enter the number: ");

            boolean isAnInt = scanner.hasNextInt();

            if(isAnInt){

                int number = scanner.nextInt();

                if(isFirstNumber){
                    min = number;
                    max = number;
                    isFirstNumber = false;
                }
                if(number > max){
                    max = number;
                }
                if(number < min){

                    min = number;
                }
            }
            else {
                break;
            }
            scanner.nextLine();
        }

        System.out.println("Min : " + min + " Max : " + max);

        scanner.close();
    }
}
