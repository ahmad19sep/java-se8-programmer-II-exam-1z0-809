package com.exam.se8_programmer_II._java_class_design.polymorphism;

public class Rectangle implements Shape{
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    private double length;
    private double width;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getArea() {
        return length*width;
    }
}
