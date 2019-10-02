package com.capgemini.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capgemini.springcore.beans.Pet;

public class AnimalTest {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("petConfig.xml");
		Pet pet = context.getBean("pet", Pet.class);
		System.out.println("Pet Name = "+ pet.getName());
		pet.getAnimal().makeSound();
		pet.getAnimal().eat();
	}

}
