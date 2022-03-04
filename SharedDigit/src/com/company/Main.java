package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(hasSharedDigit( 19, 99));
    }
    public static boolean hasSharedDigit(int a, int b){

          if (!(10<=a && a <= 99 && 10 <= b && b <=99)) {
            return false;
        }
        int aL = a / 10;
        int aR = a % 10;
        int bL = b / 10;
        int bR = b % 10;

            if ((aL == bL || aL == bR )|| (aR == bL || aR == bR)){
                return true;
            }
            else return false;
        }
}



