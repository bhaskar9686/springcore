package com.capgemini.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capgemini.springcore.beans.CountryBean;

public class CountryTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("countryConfig.xml");
		CountryBean bean = context.getBean(CountryBean.class);
		
		System.out.println("Country Name= "+ bean.getName());
		System.out.println("Country Code= "+ bean.getCountryCode());
		System.out.println("States= "+ bean.getStates());
	}

}
