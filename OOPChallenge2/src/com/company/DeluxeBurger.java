package com.company;

public class DeluxeBurger extends Hamburger {
    public DeluxeBurger() {
        super("Deluxe", "white", "sausage & chicken", 450);
        super.addHamburgerAddition1("chips",150);
        super.addHamburgerAddition2("drinks",100);
    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("Cannot add any more addition to deluxe");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("Cannot add any more addition to deluxe");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("Cannot add any more addition to deluxe");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("Cannot add any more addition to deluxe");
    }
}
