package com.company;

public class Main {

    public static void main(String[] args) {
        for(int i = 8; i > 1; i--){
            System.out.println("The interest is: " + String.format("%.2f",calculateInterest(10000.0, i)));
        }

        threePrimes();
    }

    public static double calculateInterest(double amount, double interestRate){
        return (amount * (interestRate / 100));
    }

    public static void threePrimes(){

        int noOfPrime = 0;
        for (int i = 1; i < 20; i++) {

            if(noOfPrime == 10){
                System.out.println("Existing for loop");
                break;
            }

            if(isPrime(i)){
                System.out.println(i);
                noOfPrime++;
            }
        }
    }

    public static boolean isPrime(int n){

        if(n == 1){
            return false;
        }

        for(int i = 2; i <= (n/2); i++){

            if(n % i == 0){
                return false;
            }
        }

        return true;
    }
}