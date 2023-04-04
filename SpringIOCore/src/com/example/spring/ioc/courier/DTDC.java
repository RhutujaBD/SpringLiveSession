package com.example.spring.ioc.courier;

public class DTDC implements Courier{

	public DTDC(){
		
		System.out.println("0-arg constructor called in DTDC .");
	}
	
	@Override
	public final String delivery(int deliveryID) {
		// TODO Auto-generated method stub
		return "DTDC delivering courier to address with orderid ..: "+deliveryID;
	}

}
