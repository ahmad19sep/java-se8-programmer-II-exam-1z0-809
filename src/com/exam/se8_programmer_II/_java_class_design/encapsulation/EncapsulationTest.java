package com.exam.se8_programmer_II._java_class_design.encapsulation;

public class EncapsulationTest {
   //Modifing and taking the data  using setter or getter methods of Student class
   public static void main(String[] args) {
       Student std1=new Student("Ali","lhr-1222","CSMB-A");

       System.out.printf("Name:  %s%nStudentId: %s%nSection: %s",std1.getName(),std1.getId(),
               std1.getSection());
       System.out.println("\n***** After modifing the data  of same object ******");
       // Modifing the data using setter method
       std1.setId("ISB-254");
       std1.setName("Ahmad");

       // Again printing the data using getter method
       System.out.printf("Name:  %s%nStudentId: %s%nSection: %s",std1.getName(),std1.getId(),
               std1.getSection());
   }
}
