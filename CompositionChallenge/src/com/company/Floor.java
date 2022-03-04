package com.company;

public class Floor {
    private int width;
    private  int length;
    private  String material;

    public Floor(int width, int length, String material) {
        this.width = width;
        this.length = length;
        this.material = material;
    }
    public void cleanFloor(){
        System.out.println("Floor has been cleaned");
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    public String getMaterial() {
        return material;
    }
}
