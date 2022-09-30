package com.exam.se8_programmer_II.advanced_java_class_design.Enums;

public class SimpleEnum {
    enum Days {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

    public static void main(String[] args) {
        System.out.println(Days.WEDNESDAY);
        Days d=Days.valueOf(String.valueOf(Days.WEDNESDAY));
        System.out.println(d);

    }
}
