package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int[] myIntArray = new int [10];
      /*myIntArray[0]=10;
      myIntArray[1]=20;
      myIntArray [2]=30;
      */
        for(int i =0;i < myIntArray.length;i++){
            myIntArray[i]=i*10;
        }
       /* for(int i =0;i < myIntArray.length;i++){
            System.out.println("The index " + i + " has number " + myIntArray[i]);
        }*/
        printArray(myIntArray);  //this method allows  an array to be passed in as a parameter and thereafter to loop printing the values like the above code.
      //  int[] myIntArray2 = {1,2,3,4,5,6,7,8,9};


    }
    public static void printArray(int [] array){
        for(int i =0;i < array.length;i++){
            System.out.println("The index " + i + " has number " + array[i]);
        }
    }
}
