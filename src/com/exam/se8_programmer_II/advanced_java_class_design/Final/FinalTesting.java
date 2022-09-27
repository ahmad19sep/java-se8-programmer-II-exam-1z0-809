package com.exam.se8_programmer_II.advanced_java_class_design.Final;

public class FinalTesting {
    public static void main(String[] args) {
        UseOfFinal customer1=new UseOfFinal("233h44","cricketBall");
          /**

            Now we cannot set or reChange the order number if we try then compiler gives error
        because its final fields.  we can only get the values.


        */
        System.out.println(customer1);


    }
}
