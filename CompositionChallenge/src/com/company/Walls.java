package com.company;

public class Walls {
    private String buildingMaterial;
    private String color;

    public Walls(String buildingMaterial, String color) {
        this.buildingMaterial = buildingMaterial;
        this.color = color;
    }
    public void paintWall(String color){
        System.out.println("Color painted on the walls is " + color);
    }

    public String getBuildingMaterial() {
        return buildingMaterial;
    }

    public String getColor() {
        return color;
    }
}
