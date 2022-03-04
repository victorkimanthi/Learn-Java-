package com.company;

public class Main {

    public static void main(String[] args) {
       /*
       PROGRAM WITHOUT ENCAPSULATION
       Player player = new Player();
        player.name = "Tim";
        player.health = 20;
        player.weapon = "Sword";

        int damage = 10;
        player.loseHealth(damage);
        System.out.println("Remaining health =  " + player.healthRemaining());

        damage = 11;
        player.health = 200;
        player.loseHealth(damage);
        System.out.println("Remaining health =  " + player.healthRemaining());*/

       /* EnhancedPlayer player = new EnhancedPlayer("Tim", 90, "Sword");
        System.out.println("Initial health is " + player.getHealth());*/

       /* Printer printer = new Printer(20,20,true);
        System.out.println("The number of pages printed is " + printer.increasePagesPrinted(10));*/
        Printer printer = new Printer(100, true);
        System.out.println("initial page count = " +printer.getPagesPrinted());
        int pagesPrinted = printer.printPages(4);
        System.out.println("Pages printed was " +pagesPrinted +" new total print count for printer = " +printer.getPagesPrinted());
        pagesPrinted = printer.printPages(2);
        System.out.println("Pages printed was " + pagesPrinted +" new total print count for printer = " +printer.getPagesPrinted());
    }
}
