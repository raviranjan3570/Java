package com.company;

public class Main {

    public static void main(String[] args) {

        int number = 4;
        int finishNumber =  20;
        int count = 0;
        while (number <= finishNumber){
            number++;
            if(!isEvenNumber(number)){
                continue;
            }

            System.out.println("Even number: " + number);
            count++;

            if(count == 5){
                break;
            }
        }

        System.out.println("Total number of even numbers are: " + count);
    }

    public static boolean isEvenNumber(int number){

        if((number % 2) == 0){
            return true;
        }

        else {
            return false;
        }
    }
}
