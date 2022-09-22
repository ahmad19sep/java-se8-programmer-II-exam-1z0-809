package com.exam.se8_programmer_II._java_class_design.Singleton;

public class SingletonClass {
    private double phNumber;

    public double getPhNumber() {
        return phNumber;
    }

    public void setPhNumber(double phNumber) {
        this.phNumber = phNumber;
    }

    private SingletonClass(double phNumber) {
        this.phNumber = phNumber;

    }

    public static SingletonClass obj1;

    public static SingletonClass getObj1(double ph) {
        if (obj1 == null) {
            obj1 = new SingletonClass(ph);
        } else {

            obj1.setPhNumber(ph);
        }
        return obj1;
    }

}
