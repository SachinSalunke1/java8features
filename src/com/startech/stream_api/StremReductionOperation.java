package com.startech.stream_api;

import java.util.ArrayList;
import java.util.List;

import com.startech.dto.PersonDto;

public class StremReductionOperation {

	/*
	 * The JDK contains many terminal operations (such as average, sum, min, max,
	 * and count) that return one value by combining the contents of a stream. These
	 * operations are called reduction operations.
	 */
	public static void main(String[] args) {

		List<PersonDto> personList = new ArrayList<>();
		personList.add(new PersonDto("Ram", 37));
		personList.add(new PersonDto("Raj", 45));
		personList.add(new PersonDto("Shiv", 29));
		personList.add(new PersonDto("Krish", 18));
		personList.add(new PersonDto("Tej", 25));

		// 1. The Stream.reduce Method
		// Sum of ages with sum operation
		int totalAge = personList.stream().mapToInt(PersonDto::getAge).sum();
		System.out.println("Total Age :" + totalAge);
		System.out.println("--------------------------------------------------");
		
		// Sum of ages with reduce(identity, accumulator)
		Integer totalAgeReduce = personList.stream().map(PersonDto::getAge).reduce(0, (a, b) -> a + b);
		System.out.println("Total Age :" + totalAgeReduce);
		System.out.println("--------------------------------------------------");
		
		//2. The Stream.collect Method
		//Average of male members with collect operation
		

	}

}
