package com.company;

public class Door {
    private int height;
    private int length;

    public Door(int height, int length) {
        this.height = height;
        this.length = length;
    }

    public void openDoor() {
        System.out.println("Open the door");
    }
    public void closeDoor() {
        System.out.println("Close the door");
    }

    public int getWidth() {
        return height;
    }

    public int getLength() {
        return length;
    }
}
