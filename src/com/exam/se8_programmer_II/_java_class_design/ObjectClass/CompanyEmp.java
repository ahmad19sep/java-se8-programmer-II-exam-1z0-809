package com.exam.se8_programmer_II._java_class_design.ObjectClass;

import java.util.Objects;

public class CompanyEmp {
    private String name;
    private int id;
    private String qualification;
    private String homeAddress;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public CompanyEmp(String name, int id, String qualification, String homeAddress) {
        this.name = name;
        this.id = id;
        this.qualification = qualification;
        this.homeAddress = homeAddress;

    }
public int hashCode(){
        String length=""+name.length()+homeAddress.length()+id+qualification.length();
        return Integer.parseInt(length);
}

    public boolean equals(Object e) {
        if (!(e instanceof CompanyEmp))
            return false;
        CompanyEmp emp = (CompanyEmp) e;

      if (this.id==emp.id && this.name.equals(emp.name)){
          return true;
      }else return false;
    }
}
