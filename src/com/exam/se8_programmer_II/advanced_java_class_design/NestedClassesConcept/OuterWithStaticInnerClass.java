package com.exam.se8_programmer_II.advanced_java_class_design.NestedClassesConcept;

public class OuterWithStaticInnerClass {
    private static String motelName;
    private double size;
    private String location;

    public static void setMotel(String motel) {
        OuterWithStaticInnerClass.motelName = motelName;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public static class Motel{
        void motelInformation(OuterWithStaticInnerClass motel){
            System.out.println(motelName +" is a motel specially famous for tea but " +
                    "have some other dishes. Motel "+motel+"Located in"+motel.location
            +" Motel "+motelName+"has "+motel.size);
        }
        void dishesDetails(){
            System.out.println("Some details for dishes are given \n1: Mint\n2: Tea\n3: Juices\n" +
                    "4: ......");
        }
    }


}
