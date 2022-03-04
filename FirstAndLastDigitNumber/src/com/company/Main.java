package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(5));
    }
    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }

        int lastDigit = number % 10;
        int firstDigit = number;
        while (firstDigit >= 10) {
            //firstDigit/=10;
            firstDigit = firstDigit / 10;
        }
        return firstDigit + lastDigit;

    }
}
