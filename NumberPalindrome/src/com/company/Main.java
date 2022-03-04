package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(isPalindrome(222));
    }

    public static boolean isPalindrome(int number) {

        int reversedNumber = 0;
        int temp = number;
        while (number > 0) {
            int lastDigit = number % 10;
            reversedNumber = (reversedNumber * 10)+lastDigit;
            number /= 10;
        }
        return (reversedNumber == temp);
    }
}

