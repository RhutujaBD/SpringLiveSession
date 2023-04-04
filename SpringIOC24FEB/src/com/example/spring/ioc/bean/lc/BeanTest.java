package com.example.spring.ioc.bean.lc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("lcbean.xml");
		HelloBean bean = (HelloBean) context.getBean("hello");
		System.out.println(bean.sayHello());
	}

}
