package com.startech.functional_interface;

import java.util.function.Function;

import com.startech.dto.PersonDto;
import com.startech.dto.PersonEntity;

public class FunctionExample {
	// accepts one argument and returns a result.

	// The function interface contains exactly one abstract method apply(T t).

	public static void main(String[] args) {

		// convert centigrade to fahrenheit
		double centigrade = 37;
		Function<Integer, Double> centigradeToFahrenheitInt = x -> new Double((x * 9 / 5) + 32);
		System.out.println("'" + centigrade + "' centigrades = " + centigradeToFahrenheitInt.apply((int) centigrade)
				+ " Fahrenheit");

		// String to integer
		Function<String, Integer> stringToInteger = x -> Integer.valueOf(x);
		System.out.println("String to Integer :" + stringToInteger.apply("4"));

		Function<PersonEntity, PersonDto> function = (entity) -> {
			return new PersonDto(entity.getName(), entity.getAge());
		};
		PersonDto personDto = function.apply(new PersonEntity("Ramesh", 35));
		System.out.println("Name :" + personDto.getName() + " | Age :" + personDto.getAge());

	}

}
