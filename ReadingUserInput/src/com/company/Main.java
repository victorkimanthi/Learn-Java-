package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter your yearOfBirth:");
        boolean hasNextInt= scanner.hasNextInt();
        if(hasNextInt){
            int  yearOfBirth = scanner.nextInt();
            scanner.nextLine();
            int age=2022-yearOfBirth;

            System.out.println("Enter your name: ");
            String name=scanner.nextLine();
            if(age>0 && age<100){
                System.out.println("Your name is " + name+ " and you are " + age + "  years old");
            }else{
                System.out.println("Invalid year of birth");
            }
        } else{
            System.out.println("Unable to pass valid year of birth");
        }

        scanner.close();
    }
}
