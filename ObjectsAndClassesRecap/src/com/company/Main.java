package com.company;

public class Main {

    public static void main(String[] args) {
    House blueHouse= new House("blue");
    House anotherHouse = blueHouse;   //another house is a reference that points to the same house as blueHouse
        System.out.println(blueHouse.getColor());
        System.out.println(anotherHouse.getColor());
        
    House greenHouse =new House("green");
    anotherHouse =greenHouse;
        System.out.println(blueHouse.getColor());
        System.out.println(greenHouse.getColor());
        System.out.println(anotherHouse.getColor()); //another house is now pointing to a different house together with the green house reference so it prints green
    }
}
