package MyBusResv;
import java.text.*;
import java.util.ArrayList;
import java.util.Scanner;

public class BusDemo {
	
	public static void main(String[] args) {
		ArrayList<Bus> buses = new ArrayList<Bus>();
		ArrayList<Bookings> bookings = new ArrayList<Bookings>();
		
		buses.add(new Bus(1,true,2));
		buses.add(new Bus(2,false,40));
		buses.add(new Bus(3,true,35));
		
		for(Bus bus:buses) {
			bus.displayBusInfo();
		}
		
		int userOpt=1;
		Scanner s=new Scanner(System.in);
		
		while(userOpt==1) {
			System.out.println("Enter 1 for booking and 2 to exit");
			userOpt=s.nextInt();
			
			if(userOpt==1) {
				Bookings booking = new Bookings();
				
				if(booking.isAvailable(bookings,buses)) {
					bookings.add(booking);
					System.out.println("Your booking is confirmed.");
				}
				else {
					System.out.println("Sorry the bus is full.Select another bus or date.");
				}
			}
		}
	}

}
