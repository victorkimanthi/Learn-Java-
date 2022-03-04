package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] number = {1,2,3,4,5};
        System.out.println("The original array is = " + Arrays.toString(number));
        reverse(number);
        System.out.println("The reversed array is = " + Arrays.toString(number));
    }
    private static void reverse(int []array ){
        int maxIndex = (array.length-1);
        int halfLength = array.length/2;
        for(int i = 0; i < halfLength ; i ++){
            int temp = array[i];
            array[i] = array[maxIndex-i];
            array[maxIndex-i] = temp;
        }

    }
}
