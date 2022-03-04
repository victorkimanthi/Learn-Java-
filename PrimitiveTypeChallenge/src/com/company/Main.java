package com.company;

public class Main {

    public static void main(String[] args) {
        byte myByte=100;
        short myShort=10000;
        int myInt=100000;
        long longTotal=(myByte+myInt+myShort)*10l+50000l;
        System.out.println(longTotal);
        short shortTotal= (short) ((myByte+myInt+myShort)*10+50000);
    }
}
