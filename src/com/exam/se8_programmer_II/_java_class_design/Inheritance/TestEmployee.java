package com.exam.se8_programmer_II._java_class_design.Inheritance;

public class TestEmployee {
    public static void main(String[] args) {

        // Parent class
        System.out.println("***************Employee************\n");
        Employee emp1 = new Employee("Ali", "Raza", "Lhr-323-333-4");
        System.out.println(emp1.totalSalary());

        //Child Class of Employee
        System.out.println("\n*********CommisionEmpolyee child of Employee*****************\n");
        CommisionEmpolyee comEmp1 = new CommisionEmpolyee("Ali", "Akbar", "KaniPur-564-999",
                500000, 100);
        System.out.println(comEmp1.totalSalary());

        //Child class of CommisionEmployee
        System.out.println("\n***********SalaryPlusCommisionEmployee child of CommisionEmployee*******************\n");

        SalaryPlusCommisionEmpolyee salaryEmp = new SalaryPlusCommisionEmpolyee("Nabeel", "Ahmad", "NBP-323l-87",
                8000, 20, 30000);
        System.out.println(salaryEmp.totalSalary());

        // Hourly Employee ...........
        System.out.println("\n***************HourlyEmployee child of Employee***************\n");

        HourlyEmployee a=new HourlyEmployee("Abbas","Ali","FRD-444-333",4,50);
        System.out.println(a.totalSalary());

    }
}
