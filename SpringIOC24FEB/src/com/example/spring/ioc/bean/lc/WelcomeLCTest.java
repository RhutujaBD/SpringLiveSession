package com.example.spring.ioc.bean.lc;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class WelcomeLCTest {

	public static void main(String[] args) {
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("lcbean.xml");
		Welcome bean = (Welcome) context.getBean("test");
		
		System.out.println("Hash code after create .. "+bean.hashCode());
		System.out.println(bean.greeings());
		context.registerShutdownHook();
		System.out.println("Hash code after registerShutdownHook .. "+bean.hashCode());
		System.out.println("-------------------------");
		System.out.println(bean.greeings());
	}

}
