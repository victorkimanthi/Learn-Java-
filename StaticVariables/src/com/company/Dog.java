package com.company;

    class Dog {
        private static String name;
        public Dog(String name){
            Dog.name=name;
        }
        public void printName(){
            System.out.println("name =" +name);
        }
    }

