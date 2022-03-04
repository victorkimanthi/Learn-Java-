package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(getDurationString(55,200));
        System.out.println(getDurationString(3945));
    }
    public  static  String getDurationString(int minutes, int seconds){
        if((minutes>0)&& (seconds >0 && seconds <59)){
        int hours = minutes/60;
        int remainingMinutes = minutes % 60;
        return  hours + "h " + remainingMinutes + "m " + seconds + "s";

        } else {
            return "Invalid value";
        }
    }
    public  static  String getDurationString(int seconds){
        if (seconds>0){
       int minutes=seconds/60;
       int remainingSeconds=seconds%60;
            //String x =getDurationString(minutes,remainingSeconds);
            //return x;
            return getDurationString(minutes,remainingSeconds);/*the method call will be called first and then the
            return statement will return the value that it got from that method call.We are returning the return value from that method*/
        }else{
            return "Invalid value";
        }
    }
}
