package com.onlineticketBooking;

public class DemoBooking {
	public static void main(String args[]) {
		TicketBooking tb=new TicketBooking();
		tb.displayTickets();
		System.out.println(tb);
		tb.bookTicket();
		tb.bookTicket();
		tb.bookTicket();
		tb.bookTicket();
		tb.bookTicket();
		tb.bookTicket();
		tb.displayTickets();
	}

}
