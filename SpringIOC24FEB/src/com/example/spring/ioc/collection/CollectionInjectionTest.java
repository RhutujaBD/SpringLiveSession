package com.example.spring.ioc.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CollectionInjectionTest{

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("collection.xml");
		
		CollectionIOCInjecction collectionIOCInjecction=(CollectionIOCInjecction)context.getBean("javaCollection");
		
		
		collectionIOCInjecction.getPhoneNo();
		
		collectionIOCInjecction.getCountry();
		
		collectionIOCInjecction.getRecordMap();
		
		collectionIOCInjecction.getBankAccount();
	}

}
