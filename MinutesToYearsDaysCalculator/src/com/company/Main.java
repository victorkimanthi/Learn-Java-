package com.company;

public class Main {

    public static void main(String[] args) {
	printYearsAndDays(525600);
    }
    public static  void printYearsAndDays(long minutes){
        if (minutes<0){
            System.out.println("Invalid value");
        }else{
            long years=((minutes/60)/24)/365;
            long remainingDays=((minutes/60)/24)%365;
            System.out.println(minutes + " min = " + years + " y and " + remainingDays + " d");
        }
    }
}
