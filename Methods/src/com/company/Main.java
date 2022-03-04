package com.company;

public class Main {

    public static void main(String[] args) {
       boolean gameOver=true;
       int score2=800;
       int levelCompleted= 5;
       int bonus =100;

       calculateScore(gameOver,score2,levelCompleted,bonus);

       score2=10000;
        levelCompleted=8;
        bonus=200;

        calculateScore(gameOver,score2,levelCompleted,bonus);
    }
    public static void calculateScore(boolean gameOver,int score2,int levelCompleted,int bonus){
        if(gameOver==true) {
            int finalScore=score2+ (levelCompleted*bonus);
            finalScore+=2000;
            System.out.println("final score= " +finalScore);
            //(gameOver==true) is equal to (gameOver)
        }

    }
}
