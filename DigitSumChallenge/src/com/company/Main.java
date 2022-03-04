package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Sum of the digits in the number 687 is " + sumDigits(687));
        System.out.println("Sum of the digits in the number 687 is " + sumDigits(-687));
        System.out.println("Sum of the digits in the number 687 is " + sumDigits(5));
        System.out.println("Sum of the digits in the number 687 is " + sumDigits(6878900));
    }
    public static int sumDigits(int number){
        if(number<10){
            return -1;
        }
        int sum=0;
        while(number>0){
            sum+=number%10;
            number/=10;
        }return sum;
    }
}
