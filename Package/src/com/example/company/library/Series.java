package com.example.company.library;

public class Series {

    public static int nSum(int input){

        if(input > 0){

            return input + nSum(input - 1);
        }

        else{

            return 0;
        }
    }

    public static int factorial(int input){

        if(input > 0){

            return input * factorial(input - 1);
        }

        else{

            return 1;
        }
    }

    public static int fibonacci(int input){

        if(input > 1){

            return fibonacci(input - 1) + fibonacci(input - 2);
        }

        else if(input == 1){

            return 1;
        }

        else {

            return 0;
        }
    }
}
