package com.Interface;

public class Debitcard implements Payment {
	private String debitNo;
	

	public Debitcard(String debitNo) {
		super();
		this.debitNo = debitNo;
	}


	@Override
	public void process(double amt) {
		System.out.println("Processing debit card payment of Rs."+amt+" using Debit card No:"+debitNo);
		
	}

}
