package com.exam.se8_programmer_II._java_class_design.Inheritance;

public class Employee {
private final String name;
private final String lastName;
private  final String empolyeeId;

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmpolyeeId() {
        return empolyeeId;
    }

    public Employee(String name, String lastName, String empolyeeId) {
        this.name = name;
        this.lastName = lastName;
        this.empolyeeId = empolyeeId;
    }
    public String totalSalary(){
        return "First Name: "+name+
                "\nLast Name: "+lastName+"" +
                "\nEmployee Id : "+empolyeeId+
                "\n";
    }
}
