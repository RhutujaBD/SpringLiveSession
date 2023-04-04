package com.example.spring.ioc.bean.lc;

public class Welcome {
	
	public void init() {
		System.out.println("inside init called by spring config");
	}
	
	public String greeings() {
		
		return "welcome to life cycle method example";
	}

	public void destroy() {
		System.out.println("inside destroy called by spring config");
	}
	
}
