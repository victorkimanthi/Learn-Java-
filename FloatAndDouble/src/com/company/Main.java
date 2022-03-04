package com.company;

public class Main {

    public static void main(String[] args) {
	float myFloatMinValue=Float.MIN_VALUE;
    float myFloatMaxValue=Float.MAX_VALUE;
        System.out.println("the min float value=" + myFloatMinValue);
        System.out.println("the max float value=" + myFloatMaxValue);
        double myDoubleMinValue=Double.MIN_VALUE;
        double myDoubleMaxValue=Double.MAX_VALUE;
        System.out.println("the min Double value=" + myDoubleMinValue);
        System.out.println("the max Double value=" + myDoubleMaxValue);
        int myIntValue=5;
        float myFloatValue= 5.25f;
        double myDoubleValue=5.25d;

        double myPoundsValue=1000d;
        double convertedKilograms=(myPoundsValue*0.45359237);
        System.out.println("converted kilograms=" +convertedKilograms);
    }
}
