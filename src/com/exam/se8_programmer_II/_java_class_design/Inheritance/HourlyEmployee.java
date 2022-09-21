package com.exam.se8_programmer_II._java_class_design.Inheritance;

public class HourlyEmployee extends Employee{
private double totalHours;
private double ratePerHour;

    public HourlyEmployee(String name, String lastName, String empolyeeId, double totalHours, double ratePerHour) {
        super(name, lastName, empolyeeId);
        this.totalHours = totalHours;
        this.ratePerHour = ratePerHour;
    }

    public double getTotalHours() {
        return totalHours;
    }

    public void setTotalHours(double totalHours) {
        this.totalHours = totalHours;
    }

    public double getRatePerHour() {
        return ratePerHour;
    }

    public void setRatePerHour(double ratePerHour) {
        this.ratePerHour = ratePerHour;
    }

    @Override
    public String totalSalary() {
        return super.totalSalary()+"Hourly Employee gets: "+ratePerHour*totalHours+"$ per month";
    }
}
