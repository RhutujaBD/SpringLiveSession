package com.example.spring.ioc.annotation;

public class HelloBean {

	static {
		System.out.println("Bean Loading.....");
	}

	public HelloBean() {
		System.out.println("Bean Created....");
	}

	public String sayHello() {
		return "Hello Spring";
	}
}
