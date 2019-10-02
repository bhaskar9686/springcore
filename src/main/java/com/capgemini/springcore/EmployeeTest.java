package com.capgemini.springcore;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capgemini.springcore.beans.EmployeeBean;

public class EmployeeTest {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("employeeConfig.xml");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter no of Employee");
		int count  = scanner.nextInt();
		EmployeeBean[] employees = new EmployeeBean[count];

		for(int i = 0; i < count; i++) {
			employees[i] = applicationContext.getBean("emp", EmployeeBean.class);

			System.out.println("Enter Employee "+ (i+1) +" ID");
			int id = scanner.nextInt();
			System.out.println("Enter Employee "+ (i+1) +"  Name");
			String name =scanner.next();
			System.out.println("Enter Employee "+ (i+1) +"  Age");
			int age =scanner.nextInt();

			employees[i].setEmpId(id);
			employees[i].setName(name);
			employees[i].setAge(age);
		}// end of for

		for(EmployeeBean bean: employees) {
			System.out.println("ID		=	"+bean.getEmpId());
			System.out.println("Name	=	"+bean.getName());
			System.out.println("Age	=	"+bean.getAge());
			System.out.println("------------------------------");
		}
	}//End main

}//End of class
