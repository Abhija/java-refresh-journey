package com.interfaces.activity;

public class MainClass {
	
	public static void main(String[] args) {
		IBooking booking = new FlightService();
		booking.bookTicket(2);
		
		FlightService flightService = 	(FlightService)booking;
		flightService.showCitiesServed();
		
		
		//Assigning last child
		booking = new MiniBusService();
		booking.cancelTicket(0);
		//The methods in child class cann be called only after downcasting
		MiniBusService miniBusService = (MiniBusService)booking;
		miniBusService.showMinimumNumberOfUpperBirths();
		//Abstract class cannot be instantiated
	    //booking = new BusService() ;
		
		//Calling method in Busservice , not overridden by the child so the parent method
		//is called
		miniBusService.bookTicket(0);
		
		
		
	}


}
