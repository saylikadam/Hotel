package com.hotel;

/**
 * Created by saylik on 03/05/15.
 */
public class Rate {

    private final CustomerCategory customerCategory;
    public final int price;
    Days day;

    public Rate(CustomerCategory customerCategory,int price,Days day) {
        this.customerCategory = customerCategory;
        this.price = price;
        this.day = day;
    }

    public int getPrice() {
        return price;
    }
}
