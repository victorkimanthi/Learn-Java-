package com.company;

public class Main {

    public static void main(String[] args) {
	double myDoubleNumber=20;
    double myDoubleNumber2=80;
    double myDoubleTotal=(myDoubleNumber +myDoubleNumber2)*100;
    double remainder=myDoubleTotal%40;
    boolean isZeroOrNot=(remainder==0)? true : false;
        System.out.println(isZeroOrNot);
    if(!isZeroOrNot) {
        System.out.println("Got some remainder");
    }
    int myIntValue=10;
    if(myIntValue==10){
        System.out.println(" equal to 10");
    }
    }
}
