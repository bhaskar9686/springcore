package com.capgemini.springcore;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capgemini.springcore.beans.EmployeeBean;

public class EmployeeTest2 {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("employeeConfig2.xml");
		
		EmployeeBean bean = applicationContext.getBean("emp", EmployeeBean.class);
	
			System.out.println("ID			=	"+bean.getEmpId());
			System.out.println("Name		=	"+bean.getName());
			System.out.println("Age			=	"+bean.getAge());
			System.out.println("DeptId		=	"+bean.getDepartmentBean().getDeptId());
			System.out.println("DeptName	=	"+bean.getDepartmentBean().getDeptName());
			System.out.println("--------------------------------------");
	}//End main

}//End of class
