package com.company;

 class Car {
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
        return "RangeRover-> startEngine()";
    }
    @Override
    public String accelerate() {
        return "RangeRover-> accelerate()";
    }

    @Override
    public String brake() {
        return "RangeRover-> brake()";
    }
}
class Mercedes extends  Car {

    public Mercedes(String name, int noOfCylinders) {
        super(name, noOfCylinders);
    }

    @Override
    public String startEngine() {
        return  getClass().getSimpleName() +"-> startEngine()";
    }
    @Override
    public String accelerate() {
        return getClass().getSimpleName() +"-> accelerate()";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() + "-> brake()";
    }
}
class Lamborghini extends  Car {

    public Lamborghini(String name, int noOfCylinders) {
        super(name, noOfCylinders);
    }

    @Override
    public String startEngine() {
        return  getClass().getSimpleName() +"-> startEngine()";
    }
    @Override
    public String accelerate() {
        return getClass().getSimpleName() +"-> accelerate()";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() + "-> brake()";
    }
}

public class Main {

    public static void main(String[] args) {
        Car car = new Car("type car",10);
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Lamborghini lamborghini =new Lamborghini("Aventador",10);
        System.out.println(lamborghini.startEngine());
        System.out.println(lamborghini.accelerate());
        System.out.println(lamborghini.brake());

        Mercedes mercedes =new Mercedes("G-wagon",10);
        System.out.println(mercedes.startEngine());
        System.out.println(mercedes.accelerate());
        System.out.println(mercedes.brake());

        RangeRover rangerover =new RangeRover("Vogue",10);
        System.out.println(rangerover.startEngine());
        System.out.println(rangerover.accelerate());
        System.out.println(rangerover.brake());
    }
}
