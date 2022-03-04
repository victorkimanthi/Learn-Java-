package com.company;

public class Main {

    public static void main(String[] args) {
        double centimeters=calcFeetAndInchesToCentimeters(5, 14);
        if(centimeters<0.0){
            System.out.println("invalid parameters");
        }
        calcFeetAndInchesToCentimeters(100);

    }
    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if ((feet >= 0) && (inches >=0 && inches <=12)){

            double centimeters=(feet*12)*2.54;
            centimeters+= inches*2.54;
            System.out.println(feet + " feets " + " plus," + inches + " inches = " + centimeters + " centimeters");
            return  centimeters;
        }else{
            System.out.println("invalid feet or inches parameter");
            return -1;
        }
    }
    public static double calcFeetAndInchesToCentimeters( double inches){
        if(inches>0){
            double feet= (int) inches/12;
            double remainingInches= (int) inches%12;
            return calcFeetAndInchesToCentimeters(feet,remainingInches);
        }else{
            return -1;
        }
    }
}
