package com.example.spring.ioc.one;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorldTest {
	public static void main(String[] args) {
	      ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
	      HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
	      obj.getMessage();
	   }
}
