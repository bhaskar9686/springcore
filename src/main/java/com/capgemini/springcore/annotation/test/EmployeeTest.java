package com.capgemini.springcore.annotation.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.capgemini.springcore.annotation.beans.EmployeeBean;
import com.capgemini.springcore.annotation.config.EmployeeConfig;

public class EmployeeTest {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(EmployeeConfig.class);
		EmployeeBean bean = context.getBean(EmployeeBean.class);
		System.out.println("EmpName : "+bean.getName());
		System.out.println("EmpAge : "+bean.getAge());
		System.out.println("EmpId : "+bean.getEmpId());
		System.out.println("DeptName : "+bean.getDepartmentBean().getDeptName());
		System.out.println("DeptId : "+bean.getDepartmentBean().getDeptId());
	}// end of main

}
