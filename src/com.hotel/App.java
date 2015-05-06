package com.hotel;
import java.util.Arrays;

/**
 * Created by saylik on 03/05/15.
 */
public class App {

    public static void main(String[] args) {
        String [] days = Arrays.copyOfRange(args,1,args.length);
        String categoryOfCustomer = args[0];
        HotelManager hotelManager = new HotelManager();
        AppInitializer appInitializer = new AppInitializer();
        appInitializer.makeSetUp();
        String cheapestHotel = hotelManager.getCheapestHotel(categoryOfCustomer,days);
        System.out.println(cheapestHotel);
    }
}
