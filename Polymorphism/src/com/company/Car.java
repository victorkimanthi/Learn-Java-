package com.company;

public class Car {
    private  String name;
    private  int noOfCylinders;
    private  int wheels;
    private  boolean engine;

    public Car(String name, int noOfCylinders) {
        this.name = name;
        this.noOfCylinders = noOfCylinders;
        this.wheels = 4;
        this.engine = true;
    }
    public String startEngine(){
        return "Start engine";
    }
    public String accelerate(){
        return "Step on the gas to accelerate";
    }
    public String brake(){
        return "Step on the brake pedal to brake";
    }

    public String getName() {
        return name;
    }

    public int getNoOfCylinders() {
        return noOfCylinders;
    }

    public int getWheels() {
        return wheels;
    }

    public boolean isEngine() {
        return engine;
    }
}
class RangeRover extends  Car {

    public RangeRover(String name, int noOfCylinders) {
        super(name, noOfCylinders);
    }

    @Override
    public String startEngine() {
        return "Press the start button to start engine" ;
    }
/*
    @Override
    public String accelerate() {
        return super.accelerate();
    }

    @Override
    public String brake() {
        return super.brake();
    }*/
}

class Mercedes extends Car {

    public Mercedes(String name, int noOfCylinders) {
        super(name, noOfCylinders);
    }

    @Override
    public String startEngine() {
        return "Tilt the key clockwise to start engine";
    }
}

class Lamboghini extends Car {

    public Lamboghini(String name, int noOfCylinders) {
        super(name, noOfCylinders);
    }

    @Override
    public String startEngine() {
        return "Rotate the nob to start engine";
    }
}


