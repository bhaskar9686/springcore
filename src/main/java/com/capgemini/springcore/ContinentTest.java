package com.capgemini.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capgemini.springcore.beans.Continents;

public class ContinentTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("continentConfig3.xml");
		((ConfigurableApplicationContext)context).registerShutdownHook();
		Continents bean = context.getBean(Continents.class);
		System.out.println(bean.getMessage());
		System.out.println(bean.getCountries());
		
	}

}
