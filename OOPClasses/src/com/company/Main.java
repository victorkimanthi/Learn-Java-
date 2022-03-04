package com.company;

public class Main {

    public static void main(String[] args) {
	Car porsche=new Car();  //we have created an object called porsche based on the template Car
    Car mercedes = new Car();
    Car audi= new Car();
    porsche.setModel("e250");
        System.out.println("Model is " +porsche.getModel());
    }
}
