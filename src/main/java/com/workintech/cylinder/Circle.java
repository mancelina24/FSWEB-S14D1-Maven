package com.workintech.cylinder;

public class Circle {
    private double radius;


    public Circle(double radius){
    this.radius=(radius<0) ? 0:radius;
    }
    public double getRadius(){
        return radius;
    }

    public double getArea(){
        return Math.round(radius * radius * Math.PI * 100.0) / 100.0; // Virgülden sonra 2 basamak

    }
}
