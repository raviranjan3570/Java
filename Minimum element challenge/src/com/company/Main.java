package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] array = getIntegers(5);
        int min = findMin(array);
        System.out.println("The minimum is: " + min);
    }

    public static int[] getIntegers(int count) {
        System.out.println("Enter " + count + " numbers.");
        int[] values = new int[count];

        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }

        return values;
    }

    public static int findMin(int[] array) {

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array.length; j++) {

                if (array[i] < array[j]) {

                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array[0];
    }
}
