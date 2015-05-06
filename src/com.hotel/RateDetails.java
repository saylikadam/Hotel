package com.hotel;

import java.util.ArrayList;
import java.util.List;

public class RateDetails {
    List<Rate> allRates = new ArrayList<Rate>();

    public RateDetails() {

    }

    public boolean add(Rate rate) {
        if(allRates.contains(rate))
            return false;
        allRates.add(rate);
        return true;
    }

    public int getSize(){
        return allRates.size();
    }

    public int getPriceOfHotel(CustomerCategory customerCategory, Days day) {
        Rate rate = getPriceByDayAndCategory(customerCategory,day);
        return rate.getPrice();
    }

    private Rate getPriceByDayAndCategory(CustomerCategory customerCategory, Days days) {
        Rate newRate = new Rate(customerCategory,0,days);
        for(Rate rate :allRates){
            if(rate.equals(newRate)){
                return rate;
            }
        }
        return null;
    }
}
