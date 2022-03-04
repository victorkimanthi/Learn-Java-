package com.company;

public class Main {

    public static void main(String[] args) {
	int myValue=1000;
    int myIntMinValue=Integer.MIN_VALUE;
    int myIntMaxValue=Integer.MAX_VALUE;
        System.out.println("the min integer value is=" + myIntMinValue);
        System.out.println("the max integer value is=" + myIntMaxValue);
        System.out.println("busted max integer value is=" + (myIntMaxValue+1));
        System.out.println("busted min integer value is=" + (myIntMinValue-1));
        byte myByteMinValue=Byte.MIN_VALUE;
        byte myByteMaxValue=Byte.MAX_VALUE;
        System.out.println("the min Byte value is=" + myByteMinValue);
        System.out.println("the max Byte value is=" + myByteMaxValue);
        short myShortMinValue=Short.MIN_VALUE;
        short myShortMaxValue=Short.MAX_VALUE;
        System.out.println("the min Short value is=" + myShortMinValue);
        System.out.println("the max Short value is=" + myShortMaxValue);

            long myLongMinValue=Long.MIN_VALUE;
            long myLongMaxValue=Long.MAX_VALUE;
            System.out.println("the min Long value is=" + myLongMinValue);
            System.out.println("the max Long value is=" + myLongMaxValue);

    byte myByte=100;
    short myShort=10000;
    int myInt=100000;
    long myLong=(myByte+myInt+myShort)*10+50000;
        System.out.println(myLong);
    }
}
