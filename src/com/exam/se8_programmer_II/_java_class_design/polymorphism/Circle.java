package com.exam.se8_programmer_II._java_class_design.polymorphism;

public class Circle implements Shape{
    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    private double radius;

    @Override
    public double getArea() {

       return (Math.PI* Math.pow(radius,2.0));
    }
}
