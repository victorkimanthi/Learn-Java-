package com.company;

import com.sun.source.tree.Scope;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
      X x =new X(scanner.nextInt());
      x.x();
    }

}
