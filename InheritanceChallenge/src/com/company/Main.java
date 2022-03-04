package com.company;

public class Main {

    public static void main(String[] args) {
	/*Vehicle vehicle= new Vehicle(1,4);
     Car car= new Car(1,4,1,1,4);
     LandRover landRover =new LandRover(1,4,1,1,4,1);
     car.moveWheels();
    }*/
        LandRover landRover = new LandRover(36);
        landRover.steer(45);
        landRover.accelerate(30);
        landRover.accelerate(20);
        landRover.accelerate(-42);
    }
}
