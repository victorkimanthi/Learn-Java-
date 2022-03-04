package com.company;

public class Main {

    public static void main(String[] args) {
        boolean gameOver=true;
        int score2=800;
        int levelCompleted= 5;
        int bonus =100;
        int highScore= calculateScore(gameOver,score2,levelCompleted,bonus);
        System.out.println("final score= " +highScore);

        score2=10000;
        levelCompleted=8;
        bonus=200;
        highScore= calculateScore(gameOver,score2,levelCompleted,bonus);
        System.out.println("final score= " +highScore);

    }
     public static int calculateScore(boolean gameOver,int score2,int levelCompleted,int bonus){
        if(gameOver==true) {
            int finalScore=score2+ (levelCompleted*bonus);
            finalScore+=2000;
            return finalScore;
        }
        return -1;
    }
    public static  void displayHighScorePosition(String playersName,int highScorePosition) {

    }
}