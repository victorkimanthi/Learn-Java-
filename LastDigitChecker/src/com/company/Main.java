package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(41,22,21));
    }
    public static boolean hasSameLastDigit(int a,int b, int c){
        if((a<10 || a>1000)||(b<10 || b>1000)||(c<10 || c>1000)){
       // if(!(10<a && a<1000 && 10 <b && b<1000 && 10<c && c<1000)){
            return false;
        }
            int aL=a%10;
            int bL=b%10;
            int cL=c%10;
            if( (aL==bL && bL==cL && aL == cL)||(aL==bL || bL==cL || aL == cL)){
                return true;
            }else return false;
    }
    public static boolean isValid(int number) {
        if(number>10 && number < 1000){
            return true;
        }else return false;
    }
}

