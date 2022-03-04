package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(12345678));
    }
    public static int  getEvenDigitSum(int number){
        if(number<0){
            return -1;
        }
        int evenDigitSum=0;
        int lastDigit=0;

        while(number!=0){
         lastDigit=number%10;

         if(lastDigit%2==0){
             evenDigitSum += lastDigit;
         }
         number=number/10;
        }
       return evenDigitSum ;
    }
}
