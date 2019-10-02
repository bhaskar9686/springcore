package com.capgemini.springcore.postprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor{

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("Inside BFPP");
		BeanDefinition beanDefinition = beanFactory.getBeanDefinition("countries");
		
		MutablePropertyValues propertyValues = beanDefinition.getPropertyValues();
		System.out.println(propertyValues.get("message"));
		propertyValues.addPropertyValue("message", "message from BFPP");
	}

}
