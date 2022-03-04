package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(getDurationString(55,200));
        System.out.println(getDurationString(3945));
        System.out.println(getDurationString(65,9));
    }
    public  static  String getDurationString(int minutes, int seconds){
        if((minutes>0)&& (seconds >0 && seconds <59)){
            int hours = minutes/60;
            int remainingMinutes = minutes % 60;
            //making the returned value have zero ahead of it, hours e.g 01h 02m 06s
            String hourString=hours +  "h";
            if (hours<10){
                 hourString= "0" + hourString;
            }
            String minuteString=remainingMinutes +  "m";
            if (remainingMinutes<10){
                minuteString= "0" + minuteString;
            }
            String secondsString=seconds +  "s";
            if (seconds<10){
                secondsString= "0" + secondsString;
            }
            return  hourString + " " + minuteString + " " + secondsString + " ";

        } else {
            return "Invalid value";
        }
    }
    public  static  String getDurationString(int seconds) {
        if (seconds > 0) {
            int minutes = seconds / 60;
            int remainingSeconds = seconds % 60;
            //String x =getDurationString(minutes,remainingSeconds);
            //return x;
            return getDurationString(minutes, remainingSeconds);/*the method call will be called first and then the
            return statement will return the value that it got from that method call.We are returning the return value from that method*/
        } else {
            return "Invalid value";
        }

    }
}
