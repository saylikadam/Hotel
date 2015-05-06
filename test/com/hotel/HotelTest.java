package com.hotel;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by saylik on 05/05/15.
 */
public class HotelTest {

    private Hotel lakewood;
    private Hotel bridgewood;
    private Rate weekdayRegular;
    private Rate weekendRegular;
    private AllDays days;
    @Before
    public void setUp(){
        lakewood = new Hotel("lakewood",1);
        bridgewood = new Hotel("bridgewood",2);
        weekdayRegular = new Rate(CustomerCategory.Regular,110,Days.Weekday);
        weekendRegular = new Rate(CustomerCategory.Regular,90,Days.Weekend);
        lakewood.addRate(weekdayRegular);
        bridgewood.addRate(weekendRegular);
        days = new AllDays();
    }

    @Test
    public void addRateShouldAddRateToRateDetails(){
        RateDetails rateDetails = new RateDetails();
        Rate rate = new Rate(CustomerCategory.Regular,110,Days.Weekday);
        rateDetails.add(rate);
        assertEquals(rateDetails.getSize(),1);
    }

    @Test
    public void getCostForHotelShouldReturnCostForTwoWeekdaysAndWeekend(){
        days.addDays(Days.Weekday);
        days.addDays(Days.Weekday);
        days.addDays(Days.Weekend);
        int cost = lakewood.getCostOfHotel(CustomerCategory.Regular,days);
        assertEquals(310,cost);
    }
}
