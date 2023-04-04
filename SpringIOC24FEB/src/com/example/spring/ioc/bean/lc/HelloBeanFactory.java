package com.example.spring.ioc.bean.lc;

public class HelloBeanFactory {

	public HelloBean getBeanInstance() {
		System.out.println("Instance Factory Method");
		return new HelloBean();
	}
	
	public HelloBeanFactory () {
		System.out.println("Hello");
	}
}
