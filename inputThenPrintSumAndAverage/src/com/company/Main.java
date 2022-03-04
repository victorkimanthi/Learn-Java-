package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	inputThenPrintSumAndAverage();
    }
    public static void inputThenPrintSumAndAverage(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number");

        int sum=0;
        long average=0;
        int counter=0;
        while (true){
            boolean hasInt= scanner.hasNextInt();
            if(hasInt){
                counter++;
                double counterNumber=(double)counter;
                int number= scanner.nextInt();
                 sum=sum + number;
               // sum = sum + scanner.nextInt();
                 double sumNumber=(double)sum;
             average= Math.round(sumNumber/counterNumber);
               // System.out.println("SUM =" + sum +"AVG=" + average);
            }if(!hasInt)  {
               break;
            }
        }
        scanner.close();
        System.out.println("SUM =" + sum +" AVG=" + average);
        
    }
}
