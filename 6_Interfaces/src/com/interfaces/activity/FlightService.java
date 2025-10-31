package com.interfaces.activity;

public class FlightService implements IBooking {

	@Override
	public void bookTicket(int noOfTickets) {
		System.out.println("Flight Service bookTicket");
		
	}

	@Override
	public void cancelTicket(int noOfTickets) {
		System.out.println("Flight Service cancelTicket");
		
	}
	
	
	public void showCitiesServed() {
		System.out.println("Cities are Manila, Seoul, Kathmandu, Berlin");
	}
}
