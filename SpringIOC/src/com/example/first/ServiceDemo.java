package com.example.first;

import org.springframework.core.io.*;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.xml.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ServiceDemo{
	
	public static void main(String[] args){    
		ApplicationContext bean= new ClassPathXmlApplicationContext("myBean.xml");
		
		ServiceWorld ser = (ServiceWorld)bean.getBean("service1");		
		System.out.println(ser.getMessage());
		System.out.println("First object Hashcode "+ser.hashCode());
		
		ServiceWorld ser1 = (ServiceWorld)bean.getBean("service2");
		System.out.println(ser1.getMessage());
		System.out.println("Secound object Hashcode "+ser1.hashCode());
		
		ServiceWorld ser3 = (ServiceWorld)bean.getBean("service3");
		System.out.println(ser3.getMessage());
		System.out.println("Third object Hashcode "+ser3.hashCode());
		
	
		
		
	}
}