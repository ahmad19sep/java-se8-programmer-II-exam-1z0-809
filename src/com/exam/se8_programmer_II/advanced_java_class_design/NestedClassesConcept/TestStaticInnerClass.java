package com.exam.se8_programmer_II.advanced_java_class_design.NestedClassesConcept;

public class TestStaticInnerClass {
    public static void main(String[] args) {
        OuterWithStaticInnerClass motel1=new OuterWithStaticInnerClass();
        motel1.setLocation("Johar Town Lahore Pakistan");
        motel1.setSize(4.6);
       motel1.setMotel("CapCup");
      OuterWithStaticInnerClass.Motel a=new OuterWithStaticInnerClass.Motel();
        a.dishesDetails();
        a.motelInformation(motel1);
    }
}
