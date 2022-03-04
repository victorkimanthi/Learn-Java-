package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(area(4,3));
        System.out.println(area(7));
    }
    public static double area(double radius){
        if(radius<0){
            return -1.0;
        }else{
       double areaOfCircle=radius*radius*Math.PI;
       return areaOfCircle;
        }
    }
    public static double area(double x, double y){
     if((x<0) || (y<0) || (x<0 && y<0)){
         return -1.0;
     }else  {
         double areaOfRectangle= x*y;
         return areaOfRectangle;
     }
    }
}
