package com.example.spring.ioc.ref;

import java.util.Date;

public class DateGreeting {
	
	private String name;
	private Date date;
	
	public void setName(String name) {
		this.name = name;
	}

	public void setDate(Date date) {
		this.date = date;
	}


	public String generateGreeting() {
		
		return "Good Morning " + name + " Time is ..: " + date;
	}
	
}
