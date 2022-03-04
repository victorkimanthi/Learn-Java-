package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(getLargestPrime(1));

    }

    public static int getLargestPrime(int number) {
        if (number <= 1) {
            return -1;
        }
        int j = 0;
        for (int i = 2; i <= (number); i++) {
           
            j = i;
            while (number % i == 0) {
                number /= i;
            }
        }
        return j;
    }
}