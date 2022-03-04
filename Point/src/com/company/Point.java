package com.company;

public class Point {
    private int x;
    private  int y;
    public Point(){

    }
    public Point(int x,int y){
        this.x=x;
        this.y=y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    public double distance(){
        double xA=x;
        double xB=0;
        double yB=0;
        double yA=y;
        return Math.sqrt((xB-xA)*(xB-xA) + (yB-yA)*(yB-yA));
    }
    public double distance(int x ,int y){
        double xA=x;
        double xB=this.x;
        double yB=this.y;
        double yA=y;
       return Math.sqrt((xB-xA)*(xB-xA) + (yB-yA)*(yB-yA));
    }

    public double distance(Point anotherPoint ){
        double xA=x;
        double yA=y;

        double xB=anotherPoint.x;
        double yB=anotherPoint.y;

        return Math.sqrt((xB-xA)*(xB-xA) + (yB-yA)*(yB-yA));
    }
}
