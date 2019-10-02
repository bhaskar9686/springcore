package com.capgemini.springcore.annotation.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.capgemini.springcore.annotation.beans.MessageBean2;
import com.capgemini.springcore.annotation.config.MessageConfig3;

public class MessageTest {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(MessageConfig3.class);
		((ConfigurableApplicationContext)context).registerShutdownHook();
		MessageBean2 messageBean =context.getBean(MessageBean2.class);
		System.out.println(messageBean.getMessage());
		
		
	}// end of main

}// end of class
