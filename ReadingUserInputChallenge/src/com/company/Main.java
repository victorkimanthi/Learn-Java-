package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int counter = 0;
        //while (counter<10){
            while (true) {
            int order = counter + 1;
            System.out.println("Enter a number #" + order + ":");
            boolean hasNextInt = scanner.hasNextInt();
            if (hasNextInt) {
                int number = scanner.nextInt();
                counter++;
                sum += number;
                if (counter == 10) {
                    break;
                }
            } else {
                System.out.println("Invalid number");
            }
            String inv = scanner.nextLine();
            System.out.println("the invalid char = "+inv);
        }
        System.out.println("sum=" + sum);
        scanner.close();
    }
}

