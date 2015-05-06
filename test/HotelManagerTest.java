import com.hotel.Hotel;
import com.hotel.HotelManager;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by saylik on 05/05/15.
 */
public class HotelManagerTest {

    @Test
    public void addHotelShouldAddAHotelIntoList(){
        HotelManager hotelManager = new HotelManager();
        Hotel hotel = new Hotel("Zafran",5);
        hotelManager.addHotel(hotel);
        assertEquals(hotelManager.getSize(),1);
    }


}
