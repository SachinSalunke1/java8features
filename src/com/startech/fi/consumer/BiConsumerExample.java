package com.startech.fi.consumer;

import java.util.function.BiConsumer;

import com.startech.dto.PersonDto;

public class BiConsumerExample {
	
	//accepts two input arguments and returns no result.
	//BiConsumer interface contains exactly one abstract method accept(T arg0, U arg1)

	public static void main(String[] args) {
		
		BiConsumer<PersonDto, PersonDto> biConsumer = (p1,p2)->{
			System.out.println("First Person Details : Name :"+p1.getName()+" | Age :"+p1.getAge());
			System.out.println("Second Person Details : Name :"+p2.getName()+" | Age :"+p2.getAge());
		};
		
		biConsumer.accept(new PersonDto("Ramesh", 35), new PersonDto("Suresh", 30));

	}

}
