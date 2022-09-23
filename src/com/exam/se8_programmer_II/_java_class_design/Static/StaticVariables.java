package com.exam.se8_programmer_II._java_class_design.Static;

public class StaticVariables {
    static int name;
    double phNo;
    static String companyName;

    public static void main(String[] args) {
        //Here you see static has class scope used any where in the class
        System.out.println(name);
        System.out.println(companyName);
    }

}
