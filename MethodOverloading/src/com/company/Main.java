package com.company;

public class Main {

    public static void main(String[] args) {

    int newScore= calculateScore("Messi",100);
        System.out.println("newScore is " + newScore );

        int anotherScore= calculateScore(150);
       System.out.println("anotherScore is " + anotherScore );
       
        calculateScore();
    }
    public static int calculateScore(String playerName, int score){
        System.out.println(playerName + " scored " + score + " points");
        return score*1000;
    }
    public static int calculateScore(int score){
        return score*2;
    }
    public static int calculateScore(){
        System.out.println("No player name and no score ");
        return 0;
    }
}
