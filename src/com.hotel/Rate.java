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

        if (customerCategory != rate.customerCategory) return false;
        return day == rate.day;
    }

    @Override
    public int hashCode() {
        int result = customerCategory.hashCode();
        result = 31 * result + day.hashCode();
        result = 31 * result + price;
        return result;
    }
}
