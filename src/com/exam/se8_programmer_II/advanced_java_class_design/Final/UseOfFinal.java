package com.exam.se8_programmer_II.advanced_java_class_design.Final;

import java.time.LocalTime;

public final class UseOfFinal {
    private  final String  orderNO;
    private  final String productName;

    public String getOrderNO() {
        return orderNO;
    }

    public String getProductName() {
        return productName;
    }

    public UseOfFinal(String orderNO, String productName) {
     status();
        this.orderNO = orderNO;
        this.productName = productName;
    }
    public String toString(){
        return "Order Number :"+orderNO+"\n product Name :"+productName;
    }
    public final String status(){
        if (LocalTime.now().getHour()<=12)
        return "Shop is closed now";
        else
            return "Shop is open now";

    }
}
