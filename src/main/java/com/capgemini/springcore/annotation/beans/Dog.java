package com.capgemini.springcore.annotation.beans;

import com.capgemini.springcore.interfaces.Animal;

public class Dog implements Animal{

	@Override
	public void eat() {
		System.out.println("Eating Pedigree");
	}

	@Override
	public void makeSound() {
		System.out.println("Bow Bow");		
	}

}// End of class
