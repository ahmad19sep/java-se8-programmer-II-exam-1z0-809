package com.exam.se8_programmer_II._java_class_design.encapsulation;

public class EncapsulationTest {
    public static void main(String[] args) {

        Student student = new Student();
        student.setName("John");
        student.setId(1001);

        System.out.println("Student ID: " + student.getId());
        System.out.println("Student Name: " + student.getName());
    }
}
