package com.capgemini.springcore.annotation.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.capgemini.springcore.annotation.beans.MessageBean;
import com.capgemini.springcore.annotation.config.MessageConfig2;

public class MessageTest2 {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(MessageConfig2.class);
		MessageBean messageBean =context.getBean(MessageBean.class);
		System.out.println(messageBean.getMessage());
		
		MessageBean messageBean2 = context.getBean(MessageBean.class);
		System.out.println(messageBean2.getMessage());
		
		messageBean2.setMessage("it is mb-2");
		System.out.println(messageBean.getMessage());
		System.out.println(messageBean2.getMessage());
		
	}// end of main

}// end of class
