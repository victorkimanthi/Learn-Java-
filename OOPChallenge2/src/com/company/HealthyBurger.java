package com.company;

public class HealthyBurger extends Hamburger {

    private String healthyAddition1Name;
    private double healthyAddition1Price;

    private String healthyAddition2Name;
    private double healthyAddition2Price;

    public HealthyBurger(String meat,double price) {
        super("healthy", "brown rye", meat, price);

    }

    public void addHealthyHamburgerAddition1(String name, double price) {
        this.healthyAddition1Name = name;
        this.healthyAddition1Price = price;
    }

    public void addHealthyHamburgerAddition2(String name, double price) {
        this.healthyAddition2Name = name;
        this.healthyAddition2Price = price;

    }

    @Override
    public double totalHamburgerAdditionsPrice() {
        double hamburgerPrice = super.totalHamburgerAdditionsPrice();
        if(this.healthyAddition1Name != null){
            hamburgerPrice+=healthyAddition1Price;
            System.out.println(this.healthyAddition1Name + " has been added with a price of " + this.healthyAddition1Price);
        }
        if(this.healthyAddition2Name != null){
            hamburgerPrice+=healthyAddition2Price;
            System.out.println(this.healthyAddition2Name + " has been added with a price of " + this.healthyAddition2Price);
        }
        return  hamburgerPrice;
    }
}