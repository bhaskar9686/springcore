package com.capgemini.springcore.annotation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.capgemini.springcore.annotation.beans.EmployeeBean;

@Configuration
public class EmployeeConfig2 {

	@Bean
	public EmployeeBean getEmployeeBean() {
		
		EmployeeBean employeeBean = new EmployeeBean();
		employeeBean.setName("Bhaskar");
		employeeBean.setEmpId(100);
		employeeBean.setAge(25);
		
		return employeeBean;
	}// end of getEmployeeBean
	
}// end of class

