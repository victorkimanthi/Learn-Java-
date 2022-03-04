package com.company;

import com.sun.source.tree.BreakTree;

public class ComplexNumber {
    private double real;
    private double imaginary;

    public  ComplexNumber(double real,double imaginary) {
        this.real = real;
        this.imaginary =imaginary;
    }

    public double getReal() {
        return this.real;
    }

  /*  public void setReal(double real) {
        this.real = real;
    }

    public void setImaginary(double imaginary) {
        Imaginary = imaginary;
    }*/

    public double getImaginary() {
        return this.imaginary;
    }
    public void add(double real, double imaginary){
        this.real = this.real + real ;

        this.imaginary = this.imaginary + imaginary;
    }
    public void add(ComplexNumber complexNumber){
        this.real = this.real + complexNumber.real ;

        this.imaginary = this.imaginary + complexNumber.imaginary;
    }
    public void subtract(double real, double imaginary){
        this.real = this.real - real ;

        this.imaginary = this.imaginary - imaginary ;
    }
    public void subtract(ComplexNumber complexNumber){
        this.real = this.real - complexNumber.real ;
        this.imaginary = this.imaginary - complexNumber.imaginary;
    }
}
