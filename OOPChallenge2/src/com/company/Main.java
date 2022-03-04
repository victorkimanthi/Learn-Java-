package com.company;

public class Main {

    public static void main(String[] args) {
	Hamburger hamburger=new Hamburger("basic","white","beef",350);
    hamburger.totalHamburgerAdditionsPrice();
    hamburger.addHamburgerAddition1("carrot",100);
    hamburger.addHamburgerAddition2("onion",150);
    hamburger.addHamburgerAddition3("tomato",120);
    hamburger.addHamburgerAddition4("lettuce",140);
        System.out.println("Total burger price is " + hamburger.totalHamburgerAdditionsPrice());

    HealthyBurger healthyBurger =new HealthyBurger("sausage",300);
    healthyBurger.addHamburgerAddition1("broccoli",160);
    healthyBurger.addHealthyHamburgerAddition1("egg",20);
        System.out.println("Total burger price is " + healthyBurger.totalHamburgerAdditionsPrice());

        DeluxeBurger deluxeBurger =new DeluxeBurger();
        deluxeBurger.addHamburgerAddition3("carrot",120);
        System.out.println("Total burger price is " + deluxeBurger.totalHamburgerAdditionsPrice());
    }
}
