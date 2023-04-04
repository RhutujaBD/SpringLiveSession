package com.example.spring.ioc.courier;

import java.util.Random;

public class FlipKart {

	private Courier courier;
	
	public FlipKart(){
		
		System.out.println("0-arg constructor called in FlipKart .");
	}

	public void setCourier(Courier courier) {
		this.courier = courier;
	}
	
	public String purchaseItem(String item[]) {
		Random random = new Random();
		
		int orderId = random.nextInt();
		
		String status = courier.delivery(orderId);
		
		return status + "  Bill Amount for order id is . " + orderId + " 70000 ";
	}
}
