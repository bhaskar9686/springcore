package com.capgemini.springcore.annotation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.capgemini.springcore.annotation.beans.DepartmentBean;

@Configuration
public class DepartmentConfig {
	
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

