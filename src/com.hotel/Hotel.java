package com.hotel;

public class Hotel {

    RateDetails rateDetails = new RateDetails();

    private String name;
    private int rating;

    public Hotel(String name ,int rating) {
        this.name = name;
        this.rating = rating;
    }

    public boolean addRate(Rate rate) {
        return rateDetails.add(rate);
    }

    public Integer getCostOfHotel(CustomerCategory customerCategory, AllDays days) {
        System.out.println("=============");
        int cost = 0;
        for (Days day : days) {
            cost = cost + rateDetails.getPriceOfHotel(customerCategory,day);
        }
        return cost;
    }
}
