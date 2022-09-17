package com.exam.se8_programmer_II._java_class_design.encapsulation;
// !7-Sep-2022 !6:23pm

//Hiding the dat of the Student using the concept of Encapsulation
public class Student {
    private  String name;
    private String Id;
    private String section;

    public Student(String name, String id, String aClass) {
        this.name = name;
        Id = id;
        section = aClass;
    }

    public String getName() {
        return name;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }


    public String getSection() {
        return section;
    }


}