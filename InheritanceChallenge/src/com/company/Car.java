package com.company;

/*public class Car extends  Vehicle {
    private int steeringWheel;
    private int gearLever;
    private int wheels;


    public Car(int engine, int doors, int steeringWheel, int gearLever, int wheels) {
        super(engine, doors);
        this.steeringWheel = steeringWheel;
        this.gearLever = gearLever;
        this.wheels = wheels;
    }

    public void steerSteeringWheel() {
        System.out.println("Car.steerSteeringWheel() called");
    }

    @Override
    public void steering() {
        steerSteeringWheel();
        super.steering();
    }

    public void changeGearLever() {
        System.out.println("Car.changeGearLever() called");
    }

    @Override
    public void changeGear() {
        changeGearLever();
        super.changeGear();
    }

    public void moveWheels() {
        System.out.println("Car.moveWheels () called");
    }

    @Override
    public void move(int speed) {
        moveWheels();
        super.move(speed);
    }
}*/
public class Car extends  Vehicle {
    private int wheels;
    private int doors;
    private int gears;
    private boolean isManual;

    private int currentGear;

    public Car(String name, String size, int wheels, int doors, int gears, boolean isManual) {
        super(name, size);
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.isManual = isManual;
        this.currentGear = 1;
    }

    public void changeGear(int currentGear) {
        this.currentGear = currentGear;
        System.out.println("Car.changeGear() is  changed to " + this.currentGear + " gear");
    }
    public void changeVelocity(int speed,int direction) {
        System.out.println("Car.changeVelocity() is " + speed +" and " + direction);
        move(speed,direction);
    }
}