package com.capgemini.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capgemini.springcore.beans.MessageBean;

public class MessageTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		((ConfigurableApplicationContext)context).registerShutdownHook();
		
		//Automatic down casting
		MessageBean messageBean = context.getBean("messageBean", MessageBean.class);
		System.out.println(messageBean.getMessage());
		
		
		//((AbstractApplicationContext)context).close();
	}// End of main

}// End of class
