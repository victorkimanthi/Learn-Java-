package com.company;

public class Main {

    public static void main(String[] args) {
	ComplexNumber one = new ComplexNumber(1.0,1.0);
    ComplexNumber number = new ComplexNumber(2.5,-1.5);

    one.add(1,1);
   // one.add(number);
        System.out.println("one.real = " + one.getReal());
        System.out.println("one.Imaginary = " + one.getImaginary());
        one.subtract(number);
        System.out.println("one.real = " + one.getReal());
        System.out.println("one.Imaginary = " + one.getImaginary());
        
        number.subtract(one);
        System.out.println("number.real = " + number.getReal());
        System.out.println("number.Imaginary = " + number.getImaginary());
        
      /*  ComplexNumber result = addComplexNumbers(one, number);
        System.out.println("result.real = " + result.getReal());
        System.out.println("result.Imaginary = " + result.getImaginary());
    }

    public static ComplexNumber addComplexNumbers(ComplexNumber one, ComplexNumber number){
         ComplexNumber result = new ComplexNumber();
         result.setReal(one.getReal()+number.getReal());
         result.setImaginary(one.getImaginary()+number.getImaginary());
         return result;*/
    }


}
