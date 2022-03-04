package com.company;

public class Shape {
    private  int x;
    private int y;

    public Shape(int x, int y){
        this.x=x;
        this.y=y;
    }
}
class rectangle extends  Shape{

    private  int width;
    private int height;
     //constructor 1
    public rectangle(int x,int y){
        this (x,y,0,0);  //calls 2nd constructor
    }
    //2nd constructor
    public rectangle(int x,int y,int width,int height){
        super(x,y); //calls parent constructor with parameters x and y .
        // the constructor will initialize parameters x and y while the 2nd constructor will initialize width and height
        this.width=width;
        this.height=height;
    }
}

