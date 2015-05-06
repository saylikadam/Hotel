package com.hotel;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by saylik on 03/05/15.
 */
public class Hotel {

    RateDetails rateDetails = new RateDetails();

    private final String name;
    private final int rating;

    public Hotel(String name ,int rating) {
        this.name = name;
        this.rating = rating;
    }

    public boolean addRate(Rate rate) {
        return rateDetails.add(rate);
    }

    public Integer getCostOfHotel(CustomerCategory customerCategory, AllDays days) {
        int cost = 0;
        for (Days day : days) {
            cost = cost + rateDetails.getPriceOfHotel(customerCategory,day);
        }
        return cost;
    }
}
