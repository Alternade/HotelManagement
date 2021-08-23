package org.workshop;
import java.util.ArrayList;
import java.util.List;

public class HotelResevationService {
	private List<Hotel> hotelList = new ArrayList<>();

    public void addHotel(Hotel hotel){
        hotelList.add(hotel);
    }

    public List<Hotel> getHotels(){
        return hotelList;
    }
}