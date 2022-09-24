package com.exam.se8_programmer_II._java_class_design.ObjectClass;

public class HashCode {
    public static void main(String[] args) {
        CompanyEmp emp1=new CompanyEmp("Ali",2366,"MBA","Lahore");
        CompanyEmp emp2=new CompanyEmp("Ali",3366,"MBA","Lahore");
        System.out.println(emp1.hashCode()==emp2.hashCode());
        System.out.println(emp1.hashCode());
        System.out.println(emp2.hashCode());
    }
}
