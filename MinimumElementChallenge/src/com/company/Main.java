package com.company;

import java.util.Scanner;

public class Main {
     private static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter count :");
        int count = scanner.nextInt();
        scanner.nextLine();
      int [] returnedArray=readIntegers(count);
      int returnedMinNumber=findMin(returnedArray);
        System.out.println("Returned minimum number is " + returnedMinNumber);
    }
    public static int[] readIntegers(int count){

        int[] array = new int[count];
        for(int i=0 ; i < array.length ; i++){
            System.out.println("Enter  number:");
            int number =scanner.nextInt();
            scanner.nextLine();//it allows the program to skip to the next line
            array[i] =number;
        }
        return array;
    }
    public static int findMin(int [] array){
        int minNumber=Integer.MAX_VALUE;
        for(int i=0 ; i < array.length ; i++ ) {
            int value = array[i];

            if (value < minNumber){
                minNumber=value;
            }
        }
        return minNumber;
    }

}
