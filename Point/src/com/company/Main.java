package com.company;

public class Main {

    public static void main(String[] args) {
   Point first=new Point(6,5);
        System.out.println(first.getX());
        System.out.println(first.getY());

   Point second = new Point();
   second.setX(3);
   second.setY(1);
        System.out.println(second.getX());
        System.out.println(second.getY());
        System.out.println(first.distance());
        System.out.println(first.distance(second));
        System.out.println(first.distance(2,2));
        Point third =new Point();
        System.out.println(third.distance());

    }
}
