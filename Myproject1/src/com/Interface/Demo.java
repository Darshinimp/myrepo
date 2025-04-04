package com.Interface;

public class Demo {
	public static void main(String args[]) {
		Payment Creditcard = new Creditcard("12345678");
		Creditcard.process(1000);
		Payment UPI = new UPI("12345678");
		UPI.process(400);
		Payment Debitcard = new Debitcard("12345");
		Creditcard.process(500);
	}

}
