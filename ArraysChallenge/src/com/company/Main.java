package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
     //private static Scanner scanner =new Scanner(System.in);
    public static void main(String[] args) {
       int [] myIntegerNumbers;
       myIntegerNumbers=getIntegers(5);
       int [] sorted =sortIntegers(myIntegerNumbers);
       printArray(sorted);
    }
    public static int[] getIntegers(int number){
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter " + number + " integers");
        int[] values = new int[number];
        for(int i = 0; i < values.length;i++){
            values[i] = scanner.nextInt();
        }
        return  values;
    }
    public static void printArray(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.println("The index " + i+ " was assigned integer " + array[i]);
        }
    }
    public static int[] sortIntegers(int[] sortArray){

        // sortArray =Arrays.copyOf(sortArray,sortArray.length); //this line  can also copy the elements of another array and its length
        int tempNumber=0;
        for(int i = 0; i < sortArray.length; i++){
            for(int j = i + 1; j < sortArray.length; j++) {
                if(sortArray[i] < sortArray[j]){
                    tempNumber =sortArray[i];
                    sortArray[i]=sortArray[j];
                    sortArray[j]=tempNumber;
                }
            }
        }
        return sortArray;
    }
}
