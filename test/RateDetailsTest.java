import com.hotel.CustomerCategory;
import com.hotel.Days;
import com.hotel.Rate;
import com.hotel.RateDetails;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

/**
 * Created by saylik on 05/05/15.
 */
public class RateDetailsTest {
    private RateDetails rateDetails;
    private CustomerCategory regular;
    private CustomerCategory reward;
    private Days weekday;
    private Days weekend;

    @Before
    public void setUp(){
        rateDetails = new RateDetails();
        regular = CustomerCategory.Regular;
        reward = CustomerCategory.Reward;
        weekday = Days.Weekday;
        weekend = Days.Weekend;
    }

    @Test
    public void addShouldReturnTrueIfRateIsAddedToAllRates(){
        Rate rate = new Rate(regular,110,weekday);
        assertTrue(rateDetails.add(rate));
    }

//    @Test
//    public void addShouldReturnFalseIfSameRateIsAddedTwoTimesIntoAllRates(){
//        Rate rate1 = new Rate(regular,110,weekday);
//        Rate rate2 = new Rate(regular,20,weekday);
//        assertTrue(rateDetails.add(rate1));
//        assertFalse(rateDetails.add(rate2));
//    }

    @Test
    public void getPriceOfHotelShouldReturnThePriceOfHotelForRegularCustomer(){
        Rate rate = new Rate(regular,110,weekday);
        rateDetails.add(rate);
        int price = rateDetails.getPriceOfHotel(regular,weekday);
        System.out.println(price);
    }

}
