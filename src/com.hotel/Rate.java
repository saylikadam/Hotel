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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Rate rate = (Rate) o;

        if (price != rate.price) return false;
        if (customerCategory != rate.customerCategory) return false;
        if (day != rate.day) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = customerCategory != null ? customerCategory.hashCode() : 0;
        result = 31 * result + price;
        result = 31 * result + (day != null ? day.hashCode() : 0);
        return result;
    }
}
