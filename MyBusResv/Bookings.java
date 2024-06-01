package MyBusResv;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Bookings {
	String passengerName;
	int busNo;
	Date date;
	
	Bookings(){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your name:");
		passengerName = s.next();
		System.out.println("Enter bus number:");
		busNo = s.nextInt();
		System.out.println("Enter date[dd-nn-yyyy]:");
		String dateInput = s.next();
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		try {
			date = dateFormat.parse(dateInput);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public boolean isAvailable(ArrayList<Bookings> bookings,ArrayList<Bus> buses) {
		int capacity = 0;
		for(Bus bus:buses) {
			if(bus.getBusNo()==busNo) {
				capacity=bus.getCapacity();
			}
			
		}
		
		int booked = 0;
		for(Bookings b:bookings) {
			if(b.busNo==busNo && b.date.equals(date)) {
				booked++;
			}
		}
		
		return (capacity>booked)?true:false;
	}

}
