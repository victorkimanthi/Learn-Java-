package com.company;

public class Main {

    public static void main(String[] args) {
        Hamburger vegan = new Hamburger("vegan","bread","beef",false,true,true,false);
        System.out.println(vegan.getFinalPrice());

    }
}

class Hamburger {
    private String name;
    private  String breadRollType;
    private String meat;
    private double price = 400;
    private double lettuce =150;
    private  double carrot = 100;
    private double tomato = 200;
    private  double onion = 250;
    private boolean hasLettuce;
    private  boolean hasCarrot ;
    private boolean hasTomato ;
    private  boolean hasOnion ;
    protected double finalPrice;
    /*public Hamburger(String name, String breadRollType, String meat, double price) {
        this.name = name;
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.price = price;

        this.carrot = 100.0;
        this.lettuce = 150.0;
        this.tomato = 200.0 ;
        this.onion = 250.0 ;
    }  */

    public Hamburger(String name, String breadRollType, String meat, boolean hasLettuce, boolean hasCarrot, boolean hasTomato, boolean hasOnion) {
        this.name = name;
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.hasLettuce = hasLettuce;
        this.hasCarrot = hasCarrot;
        this.hasTomato = hasTomato;
        this.hasOnion = hasOnion;
        this.finalPrice = price;
    }

    /*public double addCarrot(){
        return this.price +this.carrot;
    }
    public void add(int carrot,int lettuce,int tomato,int onion){

    }
    public double addLettuce(){
        return this.price +this.carrot;
    }*/
    public double getFinalPrice(){

        double finalPrice = price;

        if(hasCarrot ){
            finalPrice +=carrot;
            System.out.println("The base hamburger costs " + price+" and carrot has been added at " + carrot+" The total is now " + finalPrice );
        }
        if(hasLettuce ){
            finalPrice +=lettuce;
        }
        if(hasTomato ){
            finalPrice +=tomato;
        }
        if(hasOnion ){
            finalPrice +=onion;
        }

        return  finalPrice;

    }
}
  class HealthyBurger extends Hamburger {
    private double egg=50.0;
    private double pepper=70.0;
    private boolean hasEgg;
    private boolean hasPepper;


      public HealthyBurger(String name, String breadRollType, String meat, boolean hasLettuce, boolean hasCarrot, boolean hasTomato, boolean hasOnion, boolean hasEgg, boolean hasPepper) {
          super(name, breadRollType, meat, hasLettuce, hasCarrot, hasTomato, hasOnion);
          this.hasEgg = hasEgg;
          this.hasPepper = hasPepper;
      }

      @Override
      public double getFinalPrice() {
         super.getFinalPrice();

          double finalPrice=getFinalPrice();
          if(hasEgg ){
              finalPrice +=egg;
          }
          if(hasPepper){
              finalPrice +=pepper;
          }
          return finalPrice;
      }
  }
  class DeluxeHamburger  {
      private double chips=100;
      private double drinks=70;

      public DeluxeHamburger(double chips, double drinks) {
          this.chips = chips;
          this.drinks = drinks;
      }
        if(ha ){
          finalPrice +=egg;
      }
          if(hasPepper){
          finalPrice +=pepper;
      }
  }
