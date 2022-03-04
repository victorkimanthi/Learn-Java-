package com.company;

public class Main {

    public static void main(String[] args) {
        for(int i=0; i <=10; i++) {
            System.out.println(Series.nSum(i));
        }

        System.out.println("*****************************");
        for(int i=0; i<=10; i++) {
            System.out.println(Series.factorial(i));
        }
        System.out.println("*****************************");
        for(int i=0; i<=10; i++) {
            System.out.println(com.company.Series.fibonacci(i));

        }
        /*int n =10;
        System.out.println(Series.n1 + "\n" +Series.n2);
        Series.fibonacci(n-2);*/
    }
}
