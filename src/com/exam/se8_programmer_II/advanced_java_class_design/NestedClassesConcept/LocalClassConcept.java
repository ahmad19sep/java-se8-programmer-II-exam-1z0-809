package com.exam.se8_programmer_II.advanced_java_class_design.NestedClassesConcept;

public class LocalClassConcept {
    private int num=20;
    public void localDemo(){
        final String name="Ali";
        int nonFinal=4;
        class LocalClass{
            public void display(){
                System.out.println("Sum students working java like "+num+"and in loc" +
                        "al CLASS and local class can access only final local" +
                        "variable  "+name+"But cannot access cannot  access simple variables");

            }

        }// can only instantiate in the method in which it is created
        new LocalClass().display();
    }

    public static void main(String[] args) {
        LocalClassConcept obj1=new LocalClassConcept();
        obj1.localDemo();
    }

}
