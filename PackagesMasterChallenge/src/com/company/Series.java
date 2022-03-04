package com.company;

public class Series {
    public static long nSum(int n){
        int sum=0;
        for(int i=0;i<=n;i++){
           sum =sum + i;
        }
        return sum;
    }
    public static long factorial(int n){
         if(n==0){
             return 1;
         }
        int fact = 1;
        for(int i = 1; i <= n;i ++){
            fact = fact * i;
        }
        return fact;
    }

        public static long fibonacci(int n){
         if(n ==0){
             return 0;
         }
            if(n ==1){
                return 1;
            }
            long n1=0;
            long n2=1;
            long n3 = 0;
            for(int i = 1; i < n;i ++){
            //if (n > 0){
                n3 = n1 + n2;
                n1=n2;
                n2=n3;
                //System.out.println("" + n3);
               // fibonacci(n-1);
            }
            return n3;
        }
    }

