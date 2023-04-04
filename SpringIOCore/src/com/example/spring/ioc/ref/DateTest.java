package com.example.spring.ioc.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class DateTest {

	public static void main(String[] args) {
		 ApplicationContext context = new ClassPathXmlApplicationContext("dateBean.xml");
		 DateGreeting obj = (DateGreeting) context.getBean("dateGreeting");
	     String msg = obj.generateGreeting();
	     
	     System.out.println(" Message is ..: "+msg);

	}

}
