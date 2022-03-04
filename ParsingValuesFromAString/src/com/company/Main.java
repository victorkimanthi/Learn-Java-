package com.company;

public class Main {

    public static void main(String[] args) {
	String numberString="2018";
        System.out.println("NumberString= " + numberString);
        numberString+=1;
        System.out.println("NumberString= " + numberString);

    int number=Integer.parseInt(numberString);
        System.out.println("number = " + number);
        number+=1;
        System.out.println("number = " + number);

        Double num=Double.parseDouble(numberString);
        System.out.println("number = " + num);
        num+=1;
        System.out.println("number = " + num);
    }
}
