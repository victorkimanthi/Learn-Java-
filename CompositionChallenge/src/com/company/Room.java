package com.company;

public class Room {
    private Windows windows;
    private  Door door;
    private  Walls walls;
    private Floor floor;

    public Room(Windows windows, Door door, Walls walls, Floor floor) {
        this.windows = windows;
        this.door = door;
        this.walls = walls;
        this.floor = floor;
    }
    public void itsGettingDark(){
       windows.closeWindow();
        closeTheDoor();
    }
    private  void closeTheDoor(){
        door.closeDoor();
    }

  /*  public Windows getWindows() {
        return windows;
    }

    public  Door getDoor() {
        return door;
    }

    public Walls getWalls() {
        return walls;
    }

    public Floor getFloor() {
        return floor;
    }*/
}

