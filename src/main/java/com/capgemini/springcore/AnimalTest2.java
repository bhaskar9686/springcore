package com.capgemini.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capgemini.springcore.beans.Pet;
import com.capgemini.springcore.beans.Pet2;

public class AnimalTest2 {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("petConfig2.xml");
		Pet2 pet2 = context.getBean("pet2", Pet2.class);
		System.out.println("Pet Name = "+ pet2.getName());
		pet2.getAnimal().makeSound();
		pet2.getAnimal().eat();
	}

}
