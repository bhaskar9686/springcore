package com.capgemini.springcore.annotation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.capgemini.springcore.annotation.beans.MessageBean;

@Configuration
public class MessageConfig {

	@Bean
	public MessageBean getMessageBean() {
		MessageBean bean = new MessageBean();
		bean.setMessage("It is annotation based config");
		return bean;
	}// end of getMessageBean
	
}//end of class
