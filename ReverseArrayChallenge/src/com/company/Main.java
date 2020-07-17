package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private  static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5};

        int[] reversedArray = reverse(array);

        System.out.println("Reversed array is: " + Arrays.toString(reversedArray));
    }

    public static int[] reverse(int[] array){

        int index = array.length - 1;
        int[] tempArray = new int[array.length];

        for (int value : array) {

            tempArray[index] = value;
            index--;
        }
        return tempArray;
    }
}
