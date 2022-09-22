package com.exam.se8_programmer_II._java_class_design.ImmutableClass;

public final class  ImmutableClass {
    // This is an immutable class because class is final variables are final
private final String productNumber;
private final int noOfProducts;

    public ImmutableClass(String productNumber, int noOfProducts) {
        this.productNumber = productNumber;
        this.noOfProducts = noOfProducts;
    }

    public String getProductNumber() {
        return productNumber;
    }

    public int getNoOfProducts() {
        return noOfProducts;
    }
}
