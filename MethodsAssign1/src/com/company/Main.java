package com.company;

public class Main {

    public static void main(String[] args) {
        int highScorePosition=calculateHighScorePosition(1500);
       displayHighScorePosition("Max",highScorePosition);

       highScorePosition=calculateHighScorePosition(900);
        displayHighScorePosition("Trevor",highScorePosition);

        highScorePosition=calculateHighScorePosition(400);
        displayHighScorePosition("John",highScorePosition);

        highScorePosition=calculateHighScorePosition(50);
        displayHighScorePosition("Jeremy",highScorePosition);

    }
    public static  void displayHighScorePosition(String playersName,int highScorePosition) {
        System.out.println(playersName + " managed to get into position " + highScorePosition + " on the high score table ");
    }
    public static int calculateHighScorePosition(int playerScore){
      /*if(playerScore>=1000){
          return 1;
      }else if (playerScore>=500){
          return 2;
      }else if (playerScore >=100){
          return 3;
      }else{
          return 4;
      }*/
        int position=4;
        if(playerScore>=1000){
            position=1;
        }else if(playerScore>=500){
            position=2;
        }else if(playerScore>=100){
            position=3;
        }
        return position;
    }
}
