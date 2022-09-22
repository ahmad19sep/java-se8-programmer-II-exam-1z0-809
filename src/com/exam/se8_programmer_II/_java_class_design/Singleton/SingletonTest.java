package com.exam.se8_programmer_II._java_class_design.Singleton;

public class SingletonTest {
    public static void main(String[] args) {
        // creating first object
        SingletonClass object1 = SingletonClass.getObj1(2356.7659);
        System.out.println("Object1 : " + object1.getPhNumber());
        //Now creating another object
        SingletonClass object2 = SingletonClass.getObj1(121212.11);
        System.out.println("Object1 : " + object1.getPhNumber());
        System.out.println("Object2 : " + object2.getPhNumber());
        //As you see the outPut is same so it is clear that only one object of Singleton class
        //created


    }
}
