package com.company;

/*public class Vehicle {
    private int engine;
    private int doors;


    public Vehicle(int engine, int doors) {
        this.engine = engine;
        this.doors = doors;

    }

    public void steering() {
        System.out.println("All vehicles have steering ");
    }

    public void changeGear() {
        System.out.println("All vehicles changeGears ");
    }

    public void move(int speed) {
        System.out.println("All vehicles move at a certain speed ");
    }

    public int getEngine() {
        return engine;
    }

    public int getDoors() {
        return doors;
    }
}*/ public class Vehicle {
    private String name;
    private String size;
    private int currentVelocity;
    private int currentDirection;

    public Vehicle(String name, String size) {
        this.name = name;
        this.size = size;

        this.currentVelocity=0;
        this.currentDirection=0;
    }
    public void steer(int direction){
        currentDirection=currentDirection + direction;
        System.out.println("Vehicle.steer() is = " + currentDirection +" degrees");
    }
    public void move(int velocity,int direction){
        currentVelocity= velocity;
        currentDirection= direction;
        System.out.println("Vehicle.move() is moving at " + currentVelocity+ " at " + currentDirection + " degrees ");
    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }
    public int stop() {
        return currentVelocity=0;
    }
}
