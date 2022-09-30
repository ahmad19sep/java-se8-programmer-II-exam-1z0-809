package com.exam.se8_programmer_II.advanced_java_class_design.Enums;

public enum EnumWithConstuctor {
    NURSERY(4),
    ONE(5),
    TWO(6),
    THREE(7),
    FOUR(8),
    FIVE(9),
    SIX(10),
    SEVEN(11),
    EIGHT(12),
    NINE(13),
    TEN(14),
    ELEVEN(15),
    TWELVE(16),
    GRADUATION(24),
    MARRIAGE(28),
    DEATH(80);
private int age;
    EnumWithConstuctor (int age){
this.age=age;
    }

    public int getAge() {
        return age;
    }

public static void main(String[] args) {
    EnumWithConstuctor e= EIGHT;
    System.out.println(e.getAge());
}

        }




