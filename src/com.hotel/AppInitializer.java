package com.hotel;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by saylik on 03/05/15.
 */
public class AppInitializer {

    HotelManager hotelManager = new HotelManager();
    private Hotel lakewood;
    private Hotel bridgewood;
    private Hotel ridgewood;

    private Rate lakewoodWeekdayRegularCustomer;
    private Rate lakewoodWeekdayRewardCustomer;
    private Rate lakewoodWeekendRegularCustomer;
    private Rate lakewoodWeekendRewardCustomer;

    private Rate bridgewoodWeekdayRegularCustomer;
    private Rate bridgewoodWeekdayRewardCustomer;
    private Rate bridgewoodWeekendRegularCustomer;
    private Rate bridgewoodWeekendRewardCustomer;

    private Rate ridgewoodWeekdayRegularCustomer;
    private Rate ridgewoodWeekdayRewardCustomer;
    private Rate ridgewoodWeekendRegularCustomer;
    private Rate ridgewoodWeekendRewardCustomer;

    public void addRateToHotels(){
        lakewood.addRate(lakewoodWeekdayRegularCustomer);
        lakewood.addRate(lakewoodWeekdayRewardCustomer);
        lakewood.addRate(lakewoodWeekendRegularCustomer);
        lakewood.addRate(lakewoodWeekendRewardCustomer);

        bridgewood.addRate(bridgewoodWeekdayRegularCustomer);
        bridgewood.addRate(bridgewoodWeekdayRewardCustomer);
        bridgewood.addRate(bridgewoodWeekendRegularCustomer);
        bridgewood.addRate(bridgewoodWeekendRewardCustomer);

        ridgewood.addRate(ridgewoodWeekdayRegularCustomer);
        ridgewood.addRate(ridgewoodWeekdayRewardCustomer);
        ridgewood.addRate(ridgewoodWeekendRegularCustomer);
        ridgewood.addRate(ridgewoodWeekendRewardCustomer);
    }

    public void setRateDetails(){
        lakewoodWeekdayRegularCustomer = new Rate(CustomerCategory.Regular,110,Days.Weekday);
        lakewoodWeekdayRewardCustomer = new Rate(CustomerCategory.Reward,80,Days.Weekday);
        lakewoodWeekendRegularCustomer = new Rate(CustomerCategory.Regular,90,Days.Weekend);
        lakewoodWeekendRewardCustomer = new Rate(CustomerCategory.Reward,80,Days.Weekend);

        bridgewoodWeekdayRegularCustomer = new Rate(CustomerCategory.Regular,160,Days.Weekday);
        bridgewoodWeekdayRewardCustomer = new Rate(CustomerCategory.Reward,110,Days.Weekday);
        bridgewoodWeekendRegularCustomer = new Rate(CustomerCategory.Regular,60,Days.Weekend);
        bridgewoodWeekendRewardCustomer = new Rate(CustomerCategory.Reward,50,Days.Weekend);

        ridgewoodWeekdayRegularCustomer = new Rate(CustomerCategory.Regular,220,Days.Weekday);
        ridgewoodWeekdayRewardCustomer = new Rate(CustomerCategory.Reward,100,Days.Weekday);
        ridgewoodWeekendRegularCustomer = new Rate(CustomerCategory.Regular,150,Days.Weekend);
        ridgewoodWeekendRewardCustomer = new Rate(CustomerCategory.Reward,40,Days.Weekend);
    }

    public void makeSetUp() {
        lakewood = new Hotel("lakewood",1);
        bridgewood = new Hotel("bridgewood",2);
        ridgewood = new Hotel("ridgewood",3);
        hotelManager.addHotel(lakewood);
        hotelManager.addHotel(bridgewood);
        hotelManager.addHotel(ridgewood);
        setRateDetails();
        addRateToHotels();
    }


    public String getCheapestHotel(String categoryOfCustomer, String[] inputDays) {
        CustomerCategory customerCategory = getCategory(categoryOfCustomer);
        AllDays days = getAllDays(inputDays);
        return "Hotels:"+hotelManager.calculateCheapestHotel(customerCategory,days);
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




}
