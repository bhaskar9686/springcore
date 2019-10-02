package com.capgemini.springcore.annotation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.capgemini.springcore.annotation.beans.DepartmentBean;
import com.capgemini.springcore.annotation.beans.EmployeeBean;

@Configuration
public class EmployeeConfig {

	@Bean
	public EmployeeBean getEmployeeBean() {
		
		EmployeeBean employeeBean = new EmployeeBean();
		employeeBean.setName("Bhaskar");
		employeeBean.setEmpId(100);
		employeeBean.setAge(25);
		
		return employeeBean;
	}// end of getEmployeeBean
	
	@Bean(name = "dev")
	public DepartmentBean getDev() {
		DepartmentBean departmentBean = new DepartmentBean();
		departmentBean.setDeptId(999);
		departmentBean.setDeptName("Development");
		return departmentBean;
	}// end of getDepartmentBean
	
	@Bean(name = "hr")
	public DepartmentBean getHr() {
		DepartmentBean departmentBean = new DepartmentBean();
		departmentBean.setDeptId(879);
		departmentBean.setDeptName("HR");
		return departmentBean;
	}// end of getDepartmentBean
	
	@Bean(name = "account")
	public DepartmentBean getAccount() {
		DepartmentBean departmentBean = new DepartmentBean();
		departmentBean.setDeptId(985);
		departmentBean.setDeptName("Account");
		return departmentBean;
	}// end of getDepartmentBean
	
}// end of class

