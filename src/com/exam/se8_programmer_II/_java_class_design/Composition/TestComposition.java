package com.exam.se8_programmer_II._java_class_design.Composition;

import java.time.LocalDate;

public class TestComposition {
    public static void main(String[] args) {
        //Using Composition
        BirthDay birthDay=new BirthDay("SUNDAY",2001,6);

        EmployeeSalary emp1=new EmployeeSalary(7000,birthDay);
        System.out.println(emp1);

    }
}
