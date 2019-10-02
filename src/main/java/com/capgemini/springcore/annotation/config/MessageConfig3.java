package com.capgemini.springcore.annotation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.capgemini.springcore.annotation.beans.MessageBean2;

@Configuration
public class MessageConfig3 {

	@Bean
	public MessageBean2 getMessageBean() {
		MessageBean2 bean = new MessageBean2();
		bean.setMessage("It is annotation based config");
		return bean;
	}// end of getMessageBean
	
}//end of class
