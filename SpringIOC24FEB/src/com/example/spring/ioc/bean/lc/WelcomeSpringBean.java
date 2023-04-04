package com.example.spring.ioc.bean.lc;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class WelcomeSpringBean implements InitializingBean, DisposableBean {

	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
		System.out.println("setMessage()");
	}

	public String sayWelcome() {
		return message;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		message = "This is Spring Bean";
		System.out.println("afterPropertiesSet()");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("destroy()");
	}

}
