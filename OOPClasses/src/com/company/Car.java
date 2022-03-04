package com.company;

import java.util.Locale;

public class Car {
    private int doors;
    private  int wheels;
    private  int windows;
    private String model;
    private  String Engine;
    private  String color;
    public void setModel(String model) {
        //this.model=model;
        String validModel = model.toLowerCase(Locale.ROOT);
        if (validModel.equals("carrera") || validModel.equals("911")) {
            this.model = model;
        } else {
            this.model = "unknown";
        }
    }
    public  String getModel() {
        return this.model;
        }
    }

