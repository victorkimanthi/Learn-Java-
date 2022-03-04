package com.company;

public class Main {

    public static void main(String[] args) {
        printFactors(-1);
    }
    public static void printFactors(int number){
        if(number<1){
            System.out.println("Invalid value");
        }
      /*  int i=0;
        while (number!=0){
            if(number%i==0){
                System.out.println("factors are "+ i);
            }if(number==1000){
                break;
            }
        }
*/
        for(int i=1;i<=number;i++){
            if(number%i==0){
                System.out.println("factors are "+ i);
            }
        }
    }
}
