package com.company;

public class Main {

    public static void main(String[] args) {
        boolean isAnAlien = false;
        if (isAnAlien == false) {
            System.out.println("Is not an alien");
        }
        int topScore=100;
        if(topScore>=100) {
            System.out.println("you got the high score");
        }
        //logical AND
        int secondTopScore=60;
        if(topScore>secondTopScore && topScore<200) {
            System.out.println("greater than second top score and less than 200");
        }
        //LOGICAL OR
        if(secondTopScore>70 || topScore<=100) {
            System.out.println("either or both of the conditions are true");
        }
        //TERNARY OPERATOR
        int ageOfClient=20;
        boolean ageIsOverEighteen=(ageOfClient==20)? true:false;
        if(ageIsOverEighteen){
            System.out.println("its true");
        }
    }
}
