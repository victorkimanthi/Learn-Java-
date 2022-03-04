package com.company;

import java.util.Scanner;

public class Main {
    private static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {

     int[] myInteger = getIntegers(5);
       for(int i=0;i < myInteger.length ; i++){
           System.out.println("Element " + i + " typed value was " +myInteger[i]);
       }
        System.out.println("The average is " + getIntegers(myInteger));
    }
    public static int[] getIntegers(int numbers){
        System.out.println("Enter " +numbers + " integers\r");
        int[] values =new int[numbers];

        for(int i=0; i<values.length; i++){
            values[i]=scanner.nextInt();
        }
        return values;
    }
    public static double getIntegers(int [] array) {
        double sum =0;
      for(int i =0; i< array.length; i++){
         sum += array[i];
      }
      return (double) sum/(double) array.length;
    }
}
