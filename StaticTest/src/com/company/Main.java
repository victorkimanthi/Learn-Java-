package com.company;

public class Main {

    public static void main(String[] args) {
        StaticTest firstInstance = new StaticTest("1st Instance");
       System.out.println(firstInstance.getName() + " is instance number " + StaticTest.getNumInstances());

       StaticTest secondInstance = new StaticTest("2nd instance");
       System.out.println(secondInstance.getName() + " is instance number " + StaticTest.getNumInstances());

       StaticTest thirdInstance = new StaticTest("3rd instance");
        System.out.println(thirdInstance.getName() + " is instance number " + StaticTest.getNumInstances());
    }
}
