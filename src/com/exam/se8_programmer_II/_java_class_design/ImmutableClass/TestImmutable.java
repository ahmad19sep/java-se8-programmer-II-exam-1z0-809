package com.exam.se8_programmer_II._java_class_design.ImmutableClass;

public class TestImmutable {
    public static void main(String[] args) {
        // Here we cannot change values after assigning first time via constructor
        // We cannot extend the  class because class declare final
        ImmutableClass product1=new ImmutableClass("ps233",34);

    }
}
