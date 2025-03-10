package com.workintech.cylinder;

public class Cylinder extends Circle{
    private double height;

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = (height<0)? 0: height;
    }

    public double getHeight() {
        return height;
    }
    public double getVolume() {
        return Math.round(getArea() * height * 100.0) / 100.0; // Virgülden sonra 2 basamak
    }

}
