package com.example.spring.ioc.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HelloBeanTest {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(HelloBeanConfig.class);
		HelloBean bean = (HelloBean) context.getBean("helloBean");
		System.out.println(bean.sayHello());
	}

}
