package com.hotel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HotelManager {
    private List<Hotel> hotels;

    public HotelManager() {
        hotels = new ArrayList<Hotel>();
    }

    public void addHotel(Hotel hotel) {
        hotels.add(hotel);
    }
    public int getSize(){
        return hotels.size();
    }

    public String calculateCheapestHotel(CustomerCategory customerCategory, AllDays days) {
        Map<Hotel,Integer> rateOfAllHotels = calculateRateForAllHotels(customerCategory,days);
//        for (Hotel hotel : rateOfAllHotels.keySet()) {
//        }
        return null;
    }
    //
    private Map<Hotel, Integer> calculateRateForAllHotels(CustomerCategory customerCategory, AllDays days) {
        Map<Hotel,Integer> rateOfAllHotels = new HashMap<Hotel,Integer>();
        for (Hotel hotel : hotels) {
            rateOfAllHotels.put(hotel,hotel.getCostOfHotel(customerCategory,days));
        }
        System.out.println("rateOfHiotels"+rateOfAllHotels);
        return rateOfAllHotels;
    }
}
