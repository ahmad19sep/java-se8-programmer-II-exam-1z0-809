package com.exam.se8_programmer_II.advanced_java_class_design.Enums;

public class AgeCompareWithLife {
    private String name;
    private String AreOfLife;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAreOfLife() {
        return AreOfLife;
    }

    public void setAreOfLife(String AreOfLife) {
        this.AreOfLife=AreOfLife;
    }

    public static void main(String[] args) {

        AgeCompareWithLife a=new AgeCompareWithLife();
a.setAreOfLife("NINE");
a.setName("Ali");
        for (EnumWithConstuctor clas : EnumWithConstuctor.values()){
            if (clas.toString().equals(a.AreOfLife)){
                EnumWithConstuctor e=clas;
                System.out.println(e.getAge());
    }}}}


