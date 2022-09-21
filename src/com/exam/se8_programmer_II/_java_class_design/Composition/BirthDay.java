package com.exam.se8_programmer_II._java_class_design.Composition;

public class BirthDay {
    public BirthDay(String day, int year, int month) {
        this.day = day;
        this.year = year;
        this.month = month;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }
    public String toString(){
        return getYear()+"-"+getMonth()+"-"+getDay();
    }

    private String day;
    private int year;
    private int month;
}
