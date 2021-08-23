package org.workshop;

public class HotelResevationMain {
	public class HotelReservationMain {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			HotelReservationService hRS = new HotelReservationService();
			Hotel ramada=new Hotel("Ramada", 120, 90);
			Hotel taj=new Hotel("Taj", 100,80);
			hRS.addHotel(ramada);
			hRS.addHotel(taj);
			
		
		}

	}

}
