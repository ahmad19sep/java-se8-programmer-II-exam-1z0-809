package com.exam.se8_programmer_II._java_class_design.ObjectClass;
public class EqualsMethodTesting {

    public static void main(String[] args) {
        CompanyEmp emp1=new CompanyEmp("Ali",2366,"MBA","Lahore");
        CompanyEmp emp2=new CompanyEmp("Ali",2366,"MBA","Lahore");
        if (emp1.equals(emp2)){
            System.out.println("User already exist");
        }
    }
}


