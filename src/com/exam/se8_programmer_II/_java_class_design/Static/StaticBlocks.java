package com.exam.se8_programmer_II._java_class_design.Static;

public class StaticBlocks {
    static  int staticInt;
    int nonstaticInt;
   static String smallNm;
    static {
        staticInt=5;
        smallNm="Not small Name its nick name";
    }

    public static void main(String[] args) {
        System.out.println(staticInt);
        System.out.println(new StaticBlocks().nonstaticInt);
        System.out.println(smallNm);

    }
}
