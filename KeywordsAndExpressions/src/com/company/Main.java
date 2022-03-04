package com.company;

public class Main {
    public static void main(String[] args) {
        //STATEMENTS
        System.out.println("this is a statement");
        System.out.println("this is" + " another " + "statement");
        //CODE BLOCKS AND IF AND ELSE STATEMENTS
        int score = 4000;
        if (score < 5000 && score >= 1000) {
            System.out.println("Your score is greater than 1000 but less than 5000");
        } else if (score < 1000) {
            System.out.println("your score is greater than 1000");
        } else {
            System.out.println("go here");
        }
        boolean gameOver=true;
        int score2=800;
        int levelCompleted=5;
        int bonus=100;
        if(gameOver==true) {
            int finalScore=score2+ (levelCompleted*bonus);
            finalScore+=1000;
            System.out.println("final score= " +finalScore);
            //(gameOver==true) is equal to (gameOver)
        }
         score2=10000;
         levelCompleted=8;
         bonus=200;
        if(gameOver) {
            int finalScore=score2 + (levelCompleted * bonus);
            System.out.println("secondScore is " + finalScore);
        }
    }
}