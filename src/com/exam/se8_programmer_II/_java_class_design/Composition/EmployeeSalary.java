package com.exam.se8_programmer_II._java_class_design.Composition;

import java.time.LocalDate;

public class EmployeeSalary {
    /*
    * Ahmad is a permanent employer of a company. Company offers Ahmad to increase his salary
    * every week Day that matches with his BirthDate day. Ahmad is very happy to listen that now
    * he wanted to give his birthDay to the Company. Ahmad asked me and now i work for him and by
    * using composition i will give his BirthDay to his Company*/


    private double monthlySalary;

    public double getGiftSalary() {
        return giftSalary;
    }

    private double giftSalary;
    private BirthDay birthDay;


    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }



    public EmployeeSalary(double monthlySalary, BirthDay birthDay) {
        this.monthlySalary = monthlySalary;
        this.birthDay = birthDay;
    }

    public void BirthDayWeeklyGift(){
        if (birthDay.getDay().equals(LocalDate.now().getDayOfWeek().toString())){
           monthlySalary+=100;
           giftSalary+=100;



        }}
    public String toString(){
        BirthDayWeeklyGift();
        return "Total Salary: "+monthlySalary+"\n Gifted Salary: "+
                giftSalary;


    }
}
