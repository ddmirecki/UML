package sda2.CircleAndCylinder;

import sda2.MyPointMyCircle.MyPoint;

/**
 * Created by Daniel on 2017-08-22.
 */
public class Circle {

    private double radius = 1;
    private String color = "red";



    public Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }

    public Circle(){
    }
    public Circle(double radius){
    this.radius = radius;
    }


    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public void setCenterX(int x){}
    public void setColor(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }

    public double getArea(){
        return Math.PI*Math.pow(radius, 2);
    }
}
