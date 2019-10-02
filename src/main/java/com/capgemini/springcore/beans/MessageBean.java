package com.capgemini.springcore.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class MessageBean implements InitializingBean, DisposableBean{

	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	// using init and destroy to initialisation and destroction of the object
	/*
	 * public void init() { System.out.println("It is init method"); } public void
	 * destroy() { System.out.println("It is destroy"); }
	 */

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Initialsation phase");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Destroy phase");
	}
	
	
}// End of class
