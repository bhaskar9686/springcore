package com.capgemini.springcore.annotation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.capgemini.springcore.annotation.beans.Dog;
import com.capgemini.springcore.annotation.beans.Lion;
import com.capgemini.springcore.annotation.beans.Pet;
import com.capgemini.springcore.interfaces.Animal;


@Configuration
public class AnimalConfig {
	
	@Bean(name="dog")
	public Animal getDog() {
		return new Dog();
	}
@Bean
	public Animal getLion() {
		return new Lion();
	}
}
