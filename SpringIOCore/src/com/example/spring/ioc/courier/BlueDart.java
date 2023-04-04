package com.example.spring.ioc.courier;

public class BlueDart implements Courier {

	public BlueDart(){
		
		System.out.println("0-arg constructor called in BlueDart .");
	}
	
	@Override
	public final String delivery(int deliveryID) {
		// TODO Auto-generated method stub
		return "BlueDart delivering courier to address with orderid ..: "+deliveryID;
	}

}
