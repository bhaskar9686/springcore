package com.capgemini.springcore.annotation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.capgemini.springcore.annotation.beans.Pet;


@Configuration
public class PetConfig {
	
	@Bean
	public Pet getPet() {
		Pet pet = new Pet();
		pet.setName("Puppy");
		return pet;
	}

}
