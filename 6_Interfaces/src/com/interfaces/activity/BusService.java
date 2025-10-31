package com.interfaces.activity;

public abstract class BusService implements IBooking {

	@Override
	public void bookTicket(int noOfTickets) {
		System.out.println("Bus Service bookTicket");
		
	}


}
