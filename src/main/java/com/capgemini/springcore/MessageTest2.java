package com.capgemini.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capgemini.springcore.beans.MessageBean;

public class MessageTest2 {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		//Automatic down casting
		MessageBean messageBean = context.getBean("messageBean", MessageBean.class);
		System.out.println("message 1: "+messageBean.getMessage());
		
		MessageBean messageBean2 = context.getBean("messageBean", MessageBean.class);
		System.out.println("message 2: "+messageBean2.getMessage());
		
		messageBean2.setMessage("Its Spring");
		
		System.out.println("message 1: "+messageBean.getMessage());
		System.out.println("message 2: "+messageBean2.getMessage());
	}// End of main

}// End of class
