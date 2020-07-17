package com.company;

public class Main {

    public static final String INVALID_VALUE_MESSAGE = "Invalid Value";

    public static void main(String[] args) {

        String result = getDurationString(3600);
        System.out.println("The result is: " + result);
    }

    public static String getDurationString(int minute_param, int second_param){
        if (minute_param >=0 && second_param >=0 && second_param <=59){
            int hour = minute_param / 60;
            int minute = minute_param % 60;

            String hourString = hour + "h";
            if(hour < 10){
                hourString = "0" + hourString;
            }

            String minuteString = minute + "m";
            if(minute < 10){
                minuteString = "0" + minuteString;
            }

            String secondString = second_param + "s";
            if(second_param < 10){
                secondString = "0" + secondString;
            }

            return hourString + " " + minuteString + " " + secondString;
        }

        else{
            return INVALID_VALUE_MESSAGE;
        }
    }

    public static String getDurationString(int second_param) {

        if(second_param >= 0){
            int minute = second_param / 60;
            int second = second_param % 60;
            return getDurationString(minute, second);
        }

        else {
            return INVALID_VALUE_MESSAGE;
        }
    }
}
