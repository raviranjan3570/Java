package com.company;

public class Main {

    public static void main(String[] args) {

        double result = calcFeetAndInchesToCentimeters(1051);
        System.out.println("this is the result: " + result);
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches){

        if(feet >=0 && inches >=0 && inches <=12){
            double centimeters = (feet * 12) * 2.54;
            centimeters += inches * 2.54;
            return centimeters;
        }
        return -1;
    }

    public static double calcFeetAndInchesToCentimeters(double givenInches){

        if(givenInches >=0){

            double feet;
            double inches;
            feet = (int)(givenInches / 12);
            inches = (int)(givenInches % 12);
            return calcFeetAndInchesToCentimeters(feet,inches);
        }
        return -1;
    }
}
