package com.company;

import java.util.Scanner;

public class Main {

    private  static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] sampleArray = getIntegers(5);
        int[] sortedArray = sortArray(sampleArray);
        printArray(sortedArray);
    }

    public static int[] getIntegers(int number){

        System.out.println("Enter " + number + " integer values. \r");

        int[] values = new int[number];

        for(int i = 0; i < values.length; i++){
            values[i] = scanner.nextInt();
        }

        return values;
    }

    public static void printArray(int[] arrayToBePrinted){

        for (int i = 0; i < arrayToBePrinted.length; i++){

            System.out.println("The value at in index " + i + " of the array is: " + arrayToBePrinted[i]);
        }
    }

    public static int[] sortArray(int[] arrayToBeSorted){

        for(int i = 0; i < arrayToBeSorted.length; i++){

            for (int j = 0; j < arrayToBeSorted.length; j++){

                if(arrayToBeSorted[i] > arrayToBeSorted[j]){

                    int temp = arrayToBeSorted[i];
                    arrayToBeSorted[i] = arrayToBeSorted[j];
                    arrayToBeSorted[j] = temp;
                }
            }
        }
        return arrayToBeSorted;
    }
}
