package com.Interface;

public class Creditcard implements Payment {
	private String cardNo;

	public Creditcard(String cardNo) {
		super();
		this.cardNo = cardNo;
	}

	@Override
	public void process(double amt) {
		System.out.println("Processing credit card payment of Rs."+amt+" using Credit card No:"+cardNo);
		
	}

}
