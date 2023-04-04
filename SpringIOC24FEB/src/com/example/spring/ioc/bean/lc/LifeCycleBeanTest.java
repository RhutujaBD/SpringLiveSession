package com.example.spring.ioc.bean.lc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LifeCycleBeanTest {

	public static void main(String[] args) {

	ApplicationContext context = new ClassPathXmlApplicationContext("lcbean.xml");
	HelloBean helloBean = (HelloBean)context.getBean("factoryInstance");
	String msg = helloBean.sayHello();
	System.out.println(" Greeting msg ..: "+msg);
	}

}
