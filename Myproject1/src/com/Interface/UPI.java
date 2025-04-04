package com.Interface;

public class UPI  implements Payment{
	private String upiId;

	
	public UPI(String upiId) {
		super();
		this.upiId = upiId;
	}


	@Override
	public void process(double amt) {
		System.out.println("Processing UPI payment of Rs."+amt+" using UPI Id:"+upiId);
		
	}

}
