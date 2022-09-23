package com.exam.se8_programmer_II._java_class_design.Static;

public class StaticMethods {
    public static void main(String[] args) {
        int num1=5;
        int num2=8;
        System.out.println(sum(num2,num1));

}
// static method
public static int sum(int a, int b){
    return a+b;
}
}
