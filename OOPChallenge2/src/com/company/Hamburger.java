package com.company;

import com.sun.source.tree.BreakTree;

public class Hamburger {
    private String name;
    private  String breadRollType;
    private String meat;
    private double price;

    private String  addition1Name;
    private  double addition1Price;

    private String  addition2Name;
    private  double addition2Price;

    private String  addition3Name;
    private  double addition3Price;

    private String  addition4Name;
    private  double addition4Price;

    public Hamburger(String name, String breadRollType, String meat, double price) {
        this.name = name;
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.price = price;
    }
    public void addHamburgerAddition1(String name, double price){
        this.addition1Name=name;
        this.addition1Price=price;
    }
    public void addHamburgerAddition2(String name, double price){
        this.addition2Name=name;
        this.addition2Price=price;
    }
    public void addHamburgerAddition3(String name, double price){
        this.addition3Name=name;
        this.addition3Price=price;
    }
    public void addHamburgerAddition4(String name, double price){
        this.addition4Name=name;
        this.addition4Price=price;
    }
    public double totalHamburgerAdditionsPrice (){
        double hamburgerPrice=this.price;
        System.out.println("The base price of " + this.name+ " hamburger " + this.breadRollType +"  breadRoll with  "  +this.meat+ " meat  is " + this.price);
        if(this.addition1Name != null){
            hamburgerPrice+=addition1Price;
            System.out.println(this.addition1Name + " has been added with a price of " + this.addition1Price);
        }
        if(this.addition2Name != null){
            hamburgerPrice+=addition2Price;
            System.out.println(this.addition2Name + " has been added with a price of " + this.addition2Price);
        }
        if(this.addition3Name != null){
            hamburgerPrice+=addition3Price;
            System.out.println(this.addition3Name + " has been added with a price of " + this.addition3Price);
        }
        if(this.addition4Name != null){
            hamburgerPrice+=addition4Price;
            System.out.println(this.addition4Name + " has been added with a price of " + this.addition4Price);
        }
        return hamburgerPrice;
    }
}
