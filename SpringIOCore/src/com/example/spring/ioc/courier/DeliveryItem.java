package com.example.spring.ioc.courier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DeliveryItem {

	public static void main(String[] args) {
		 ApplicationContext context = new ClassPathXmlApplicationContext("flipkart.xml");
		 
		 FlipKart flipKart = (FlipKart) context.getBean("flipKart");
		 
		 String billingMsg = flipKart.purchaseItem(new String[] {"iphone","Laptop","books"});
		 
		 System.out.println("Item delivery by .. : "+billingMsg);
		 
	     

	}

}
