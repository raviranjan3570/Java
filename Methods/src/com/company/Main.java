package com.company;

import javax.swing.text.WrappedPlainView;

public class Main {

    public static void main(String[] args) {

        int highScore = calculateScore(true, 800,5, 100);
        System.out.println("your final score was: " + highScore);

        highScore = calculateScore(true,10000, 8, 200);
        System.out.println("your final score was: " + highScore);

        displayHighScorePosition("Ravi", createHighScorePosition(1000));

    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){

        if(gameOver) {

            return score + (levelCompleted * bonus);

        }

            return -1;

    }

    public static void displayHighScorePosition(String playerName, int position){

        System.out.println(playerName + " managed to get into position " + position + " on the high score table.");

    }

    public static int createHighScorePosition(int playerScore){

       int position = 4;

        if(playerScore >= 1000){

            position = 1;
        }

        else if(playerScore >= 500){

            position = 2;
        }

        else if(playerScore >= 100){

            position = 3;
        }

        return position;

    }

}
