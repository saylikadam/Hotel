package com.hotel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HotelManager {
    private List<Hotel> hotels = new ArrayList<Hotel>();

    public void addHotel(Hotel hotel) {
        hotels.add(hotel);
    }
    public int getSize(){
        return hotels.size();
    }

    public String getCheapestHotel(String categoryOfCustomer, String[] inputDays) {
        System.out.println("in get chip"+hotels.toString());
        CustomerCategory customerCategory = getCategory(categoryOfCustomer);
        AllDays days = getAllDays(inputDays);
        return calculateCheapestHotel(customerCategory,days);
    }

    private AllDays getAllDays(String[] inputDays){
        AllDays days = new AllDays();
        for (String day : inputDays) {
            days.addDays(getDay(day));
        }
        return days;

    }
    private Days getDay(String day) {
        return day.equals("Weekday")?Days.Weekday:Days.Weekend;
    }

    private CustomerCategory getCategory(String categoryOfCustomer) {
        return categoryOfCustomer.equals("Regular")? CustomerCategory.Regular:CustomerCategory.Reward;
    }

    private String calculateCheapestHotel(CustomerCategory customerCategory, AllDays days) {
        Map<Hotel,Integer> rateOfAllHotels = calculateRateForAllHotels(customerCategory,days);
//        for (Hotel hotel : rateOfAllHotels.keySet()) {
//        }
        return null;
    }
//
    private Map<Hotel, Integer> calculateRateForAllHotels(CustomerCategory customerCategory, AllDays days) {
        Map<Hotel,Integer> rateOfAllHotels = new HashMap<Hotel,Integer>();
        System.out.println("========"+hotels.toString());
        for (Hotel hotel : hotels) {
            System.out.println("======"+hotel);
            rateOfAllHotels.put(hotel,hotel.getCostOfHotel(customerCategory,days));
        }
        return rateOfAllHotels;
    }

}
