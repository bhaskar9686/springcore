package com.capgemini.springcore.beans;

import java.util.Map;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Continents implements InitializingBean, DisposableBean{

	private Map<String, Integer> countries;
	private String message;
	

	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Continents() {
		System.out.println("Constructor");
	}

	public Map<String, Integer> getCountries() {
		return countries;
	}

	public void setCountries(Map<String, Integer> countries) {
		this.countries = countries;
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("It is destroy");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("It is init");
	}
	
}
