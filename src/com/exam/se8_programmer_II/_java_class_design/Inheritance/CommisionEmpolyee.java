package com.exam.se8_programmer_II._java_class_design.Inheritance;

public class CommisionEmpolyee extends Employee{
    private double grossSales;
    private double commisionRate;

    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double grossSales) {
        this.grossSales = grossSales;
    }

    public double getCommisionRate() {
        return commisionRate;
    }

    public void setCommisionRate(double commisionRate) {
        this.commisionRate = commisionRate;
    }

    public CommisionEmpolyee(String name, String lastName, String empolyeeId, double grossSales, double commisionRate) {
        super(name, lastName, empolyeeId);
        this.grossSales = grossSales;
        this.commisionRate = commisionRate;
    }

    @Override
    public String totalSalary() {
        return super.totalSalary()+"Employee on Commision Base gets : "+grossSales/commisionRate+"$ per month";
    }
}
