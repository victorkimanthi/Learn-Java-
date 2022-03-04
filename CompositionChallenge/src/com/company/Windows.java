package com.company;

public class Windows {
    private int width;
    private int length;

    public Windows(int width, int length) {
        this.width = width;
        this.length = length;
    }

    public void closeWindow() {
        System.out.println("Window is being closed");
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }
}