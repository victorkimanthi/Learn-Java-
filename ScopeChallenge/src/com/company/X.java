package com.company;

import java.util.Scanner;

public class X {
   /* static Scanner scanner = new Scanner(System.in);
    static int x;
    public void x(){
        System.out.println("Enter a number:");
        x=scanner.nextInt();
        for(int x=1;x<=12;x++){
            System.out.println(x + " multiplied by " + this.x +" = "+ (x* this.x));
        }
    }*/
    static int x;
    public X(int x) {
        this.x=x;
    }
    public void x(){
        for(int x=1;x<=12;x++){
            System.out.println(x + " multiplied by " + this.x +" = "+ (x* this.x));
        }
    }
}
