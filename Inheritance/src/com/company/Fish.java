package com.company;

 public class Fish extends Animal{
     private int fins;
     private int gills;
     private  int eyes;

     public Fish(String name, int brain, int body, int size, int weight, int fins, int gills, int eyes) {
         super(name, brain, body, size, weight);
         this.fins = fins;
         this.gills = gills;
         this.eyes = eyes;
     }
 }

