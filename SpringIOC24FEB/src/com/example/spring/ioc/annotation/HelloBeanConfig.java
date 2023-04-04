package com.example.spring.ioc.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloBeanConfig {
    @Bean
	public HelloBean helloBean() {
		return new HelloBean();
	}
}
