package com.onlineticketBooking;

public class TicketBooking {
	static int ticket=6;
public void displayTickets() {
		System.out.println("Total Tickets Available:"+ticket);
	}
	public void bookTicket() {
		if(ticket>0) {
			ticket--;
			System.out.println("Ticket booked Successfully!");
			System.out.println("The remaining tickets:"+ticket);
		}
		else {
		System.out.println("Tickets not available");
		
	}
	}
}
