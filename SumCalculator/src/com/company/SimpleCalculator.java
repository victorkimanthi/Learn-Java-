package com.company;

public class SimpleCalculator {
    double firstNumber;
    double secondNumber;
    public double getFirstNumber(){
        return this.firstNumber;
    }
    public double getSecondNumber(){
        return this.secondNumber;
    }
    public void setFirstNumber(double firstNumber){
        this.firstNumber=firstNumber;
    }
    public void setSecondNumber(double secondNumber){
        this.secondNumber=secondNumber;
    }
    public double getAdditionResult(){
        double additionResult =this.firstNumber + this.secondNumber;
        return additionResult;
    }
    public double getSubtractionResult(){
        double subtractionResult =this.firstNumber-this.secondNumber;
        return subtractionResult;
    }
    public double getMultiplicationResult(){
        double multiplicationResult =this.firstNumber * this.secondNumber;
        return multiplicationResult;
    }
    public double getDivisionResult(){
        double divisionResult =this.firstNumber / this.secondNumber;
        if(secondNumber==0){
            return 0;
        }
        return divisionResult;
    }
}
