package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int count =readIntegers();
    int [] returnedArray=readElements(count);
    int returnMinValue= findMin(returnedArray);
    System.out.println("Returned minimum number is " + returnMinValue);
    }

        private static int readIntegers() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the number of counts");
            int count = scanner.nextInt();
            return count;
        }
        private static int[] readElements(int count){
            Scanner scanner = new Scanner(System.in);
            int[] array2 = new int[count];
            for(int i=0 ; i < array2.length ; i++){
                System.out.println("Enter  number:");
                int number =scanner.nextInt();
                scanner.nextLine();//it allows the program to skip to the next line
                array2[i] =number;
            }
            return array2;
        }
        private static int findMin(int [] array){
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

