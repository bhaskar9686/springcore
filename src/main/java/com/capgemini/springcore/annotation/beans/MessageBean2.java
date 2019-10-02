package com.capgemini.springcore.annotation.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class MessageBean2 {

	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	@PostConstruct
	public void init() {
		System.out.println("It is init Phase");
	}
	@PreDestroy
	public void destroy() {
		System.out.println("It is destroy Phase");
	}
}// End of class
