
public class MainBooking
{
	public static void main(String[] args) 
	{
		TaxiBooking t=new TaxiBooking();
		HotelBooking h=new HotelBooking();
		FlightBooking f=new FlightBooking();
		t.booking();
		h.booking();
		f.booking();
	}
}
