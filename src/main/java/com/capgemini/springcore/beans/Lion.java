package com.capgemini.springcore.beans;

import com.capgemini.springcore.interfaces.Animal;

public class Lion implements Animal {

	@Override
	public void eat() {
		System.out.println("Eating Deer");
	}

	@Override
	public void makeSound() {
		System.out.println("Roars!");
	}

}// End of Class
