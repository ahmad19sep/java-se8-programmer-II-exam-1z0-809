package com.exam.se8_programmer_II._java_class_design.ObjectClass;

 class ToStirng {
    private String name;
    private int age;
    private double ph;


    public ToStirng(String name, int age,double ph) {
        this.name = name;
        this.age = age;
        this.ph=ph;
    }
// toString function in java returns the String representation of an object
    // Lets see the example  Overriding the toString function of object class
    @Override
    public String toString(){
        return "Name: "+name+" Age:"+age+" ph: "+ph;
    }


// Now we are going to test our toString Function
    }
    public class TestStringFunction{
        public static void main(String[] args) {
ToStirng a=new ToStirng("ali",23,22223);
            System.out.println(a);

        }

    }


