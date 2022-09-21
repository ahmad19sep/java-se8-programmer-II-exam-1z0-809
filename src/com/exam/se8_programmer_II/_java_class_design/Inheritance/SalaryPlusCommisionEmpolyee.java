package com.exam.se8_programmer_II._java_class_design.Inheritance;

public class SalaryPlusCommisionEmpolyee extends CommisionEmpolyee{
    private double BaseSalary;

    public double getBaseSalary() {
        return BaseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        BaseSalary = baseSalary;
    }

    public SalaryPlusCommisionEmpolyee(String name, String lastName, String empolyeeId, double grossSales, double commisionRate, double baseSalary) {
        super(name, lastName, empolyeeId, grossSales, commisionRate);
        BaseSalary = baseSalary;
    }

    @Override
    public String totalSalary() {
        return "First Name: "+super.getName()+
                "\nLast Name: "+super.getLastName() +
                "\nEmployee Id : "+super.getEmpolyeeId()+"\nSalary per month : "+getBaseSalary()+"$ \n " +
                "BasePlusCommisionEmployee gets total Amount per Month = "+(super.getGrossSales()/
                super.getCommisionRate()+getBaseSalary());
    }
}
