package com.capgemini.springcore.annotation.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.capgemini.springcore.annotation.beans.Pet;
import com.capgemini.springcore.annotation.config.AnimalConfig;
import com.capgemini.springcore.annotation.config.PetConfig;

public class TestAnimal {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(PetConfig.class,AnimalConfig.class);
		Pet pet = context.getBean(Pet.class);
		System.out.println(pet.getName());
		pet.getAnimal().eat();
		pet.getAnimal().makeSound();
		
	}// end of main

}// end of class
