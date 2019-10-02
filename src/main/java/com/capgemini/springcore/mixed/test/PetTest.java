package com.capgemini.springcore.mixed.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capgemini.springcore.annotation.beans.Pet;

public class PetTest {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("petConfig3.xml");
		Pet pet = context.getBean("pet", Pet.class);
		System.out.println(pet.getName());
		pet.getAnimal().eat();
		pet.getAnimal().makeSound();
	}//end of main

}// end of class
