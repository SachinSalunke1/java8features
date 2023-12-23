package com.startech.fi.function;

import java.util.function.BiFunction;

import com.startech.dto.PersonDto;

public class BiFunctionExample {

	//It represents a function that accepts two arguments and returns a result.
	//BiFunction interface contains exactly one abstract method apply(T arg0, U arg1).
	
	public static void main(String[] args) {
		
		BiFunction<PersonDto, PersonDto, Integer> biFunction = (p1,p2)->{
			return p1.getAge() + p2.getAge();
		};
		Integer totalAge = biFunction.apply(new PersonDto("Amit", 30), new PersonDto("Sumit", 40));
		System.out.println("Result :"+totalAge);
		
	}

}
