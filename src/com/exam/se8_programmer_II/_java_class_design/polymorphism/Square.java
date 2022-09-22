package com.exam.se8_programmer_II._java_class_design.polymorphism;

public class Square implements Shape{
    public Square(int sideLength) {
        this.sideLength = sideLength;
    }

    public int getSideLength() {
        return sideLength;
    }

    public void setSideLength(int sideLength) {
        this.sideLength = sideLength;
    }

    private int sideLength;

    @Override
    public double getArea() {
        return Math.pow(sideLength,2);
    }
}
