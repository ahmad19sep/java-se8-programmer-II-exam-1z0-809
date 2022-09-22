package com.exam.se8_programmer_II._java_class_design.polymorphism;

public class TestPolymorphism {
    public static void main(String[] args) {
        Shape obj1=new Circle(4.5);
        Shape obj2=new Square(8);
        Shape obj3=new Rectangle(4,6);

        System.out.printf("Area of the circle: %.2f%n",obj1.getArea());
        System.out.println("Area of the Square: "+obj2.getArea());
        System.out.println("Area of the Rectangle: "+obj3.getArea());
    }
}
