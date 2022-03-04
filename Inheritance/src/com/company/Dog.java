package com.company;

public class Dog extends  Animal {
    private String coat;
    private int legs;
    private int eyes;
    private int teeth;
    private int tail;
    public Dog(String name, int brain, int body, int size, int weight,String coat,int legs,int eyes,int teeth,int tail) {
        super(name, brain, body, size, weight);
     this.coat=coat;
     this.eyes=eyes;
     this.tail=tail;
     this.teeth=teeth;
     this.legs =legs;

    }
    private  void chew(){
        System.out.println("Dog.chew() called");
    }

    @Override
    public void eat() {
        System.out.println("Dog.eat() method called");
        chew();
        super.eat();
    }
    public void walk(){
        System.out.println("Dog.walk got called");
        super.move(5);
    }
    public void run(){
        System.out.println("Dog.run got called");
        move(10);
    }
    public void moveLegs(int speed){
        System.out.println("Dog.moveLegs called ");
    }

    @Override
    public void move(int speed) {
        System.out.println("Dog.move() got called ");
           moveLegs(speed);
        super.move(speed);
    }
}
