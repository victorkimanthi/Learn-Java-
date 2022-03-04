package com.company;

public class Main {

        public static void main(String[] args) {
            Dog rex= new Dog("rex");
            Dog fluffy= new Dog("fluffy");
            rex.printName(); // prints fluffy
            fluffy.printName(); //prints fluffy
          //  Dog tommy= new Dog("tommy");
            //THIS AN EXAMPLE OF HOW INSTANCE VARIABLES WILL PRINT OUT
            Dogs tommy= new Dogs("rex");
            Dogs chuck= new Dogs("fluffy");
            tommy.printName(); // prints fluffy
            chuck.printName(); //prints fluffy
        }
    }

