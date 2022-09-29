package com.exam.se8_programmer_II.advanced_java_class_design.NestedClassesConcept;

public class NonStaticInnerClassTest {
    public static void main(String[] args) {
        OuterWithNonStaticInner person1=new OuterWithNonStaticInner();
        person1.setName("ALi");
        OuterWithNonStaticInner.TotalIncome p1=person1.new TotalIncome();
        p1.setCarLoan(50000);
        p1.setDailyExpenses(2000);
        p1.setFarmsProfit(50000);
        p1.setHomeRent(30000);
        p1.setSalary(100000);
        p1.setSocialMediaProfit(300000);
        p1.personDetails();
        System.out.println(person1);

        System.out.println(person1.getTotalExpenses());

    }
}
