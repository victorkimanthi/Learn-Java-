package com.company;

public class Main {

    public static void main(String[] args) {
       printDayOfTheWeek(3);
    }

    public static void printDayOfTheWeek(int day) {
        switch (day) {
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }
    }
/*//IF PROGRAM OF THE SAME
    public static void printDayOfTheWeek(int day) {
        if (day == 0) {
            System.out.println("Sunday");
        } else if (day == 1) {
            System.out.println("Monday");
        } else if (day == 2) {
            System.out.println("Tuesday");
        } else if (day == 3) {
            System.out.println("Wednesday");
        } else if (day == 4) {
            System.out.println("Thursday");
        } else if (day == 1) {
            System.out.println("Friday");
        } else if (day == 1) {
            System.out.println("Saturday");
        } else {
            System.out.println("Invalid day");
        }*/
    //NUMBER IN WORDS CHALLENGE
public static void printNumberInWord(int num1){
    switch (num1){
        case 0:
            System.out.println("zero".toUpperCase());
            break;
        case 1:
            System.out.println("one".toUpperCase());
            break;
        case 2:
            System.out.println("two".toUpperCase());
            break;
        case 3:
            System.out.println("three".toUpperCase());
            break;
        case 4:
            System.out.println("four".toUpperCase());
            break;
        case 5:
            System.out.println("five".toUpperCase());
            break;
        case 6:
            System.out.println("Six".toUpperCase());
            break;
        case 7:
            System.out.println("seven".toUpperCase());
            break;
        case 8:
            System.out.println("eight".toUpperCase());
            break;
        case 9:
            System.out.println("nine".toUpperCase());
            break;
        default:
            System.out.println("other".toUpperCase());
            break;
    }
}
    }
