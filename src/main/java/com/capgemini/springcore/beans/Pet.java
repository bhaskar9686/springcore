package com.capgemini.springcore.beans;

import com.capgemini.springcore.interfaces.Animal;

public class Pet {
	private String name;
	private Animal animal;
	
	//Getter and Setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Animal getAnimal() {
		return animal;
	}
	public void setAnimal(Animal animal) {
		this.animal = animal;
	}
	
}// End of Class
