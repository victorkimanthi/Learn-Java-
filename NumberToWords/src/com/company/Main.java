package com.company;

public class Main {

    public static void main(String[] args) {
   numberToWords(1000);
    }

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        }
        int lastDigit = 0;
        int originalNumber=number;
        number=reverse(number);
        while (number > 0) {
            lastDigit = number % 10;
            switch (lastDigit) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
                default:
                    System.out.println(" number not found");
                    break;
            }
            number = number / 10;
        }
        int differenceInCount=getDigitCount(originalNumber)-getDigitCount(reverse(originalNumber));
        /*System.out.println(reverse(originalNumber));
        System.out.println(getDigitCount(originalNumber));*/

        for(int i=1;i<=differenceInCount;i++){
            System.out.println("Zero");
        }
    }

    public static int reverse(int reverseNumber) {
        //int number=0;
        int reverse = 0;
        while (reverseNumber != 0) {
            int remainder = reverseNumber % 10;
            reverse = reverse * 10 + remainder;
            reverseNumber = reverseNumber / 10;
        }
        return reverse;
    }
    public static int getDigitCount(int number){
        if(number<0){
            return -1;
        }
        int count =0;
        while(number!=0){
            int remainder=number%10;
            number=number/10;
            count++;
        }
        return count;
    }
}
