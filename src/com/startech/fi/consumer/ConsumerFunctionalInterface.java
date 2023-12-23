package com.startech.fi.consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import com.startech.dto.PersonDto;

public class ConsumerFunctionalInterface {

	public static void main(String[] args) {

		List<PersonDto> listOfPerson = new ArrayList<PersonDto>();
		listOfPerson.add(new PersonDto("abc", 27));
		listOfPerson.add(new PersonDto("mno", 26));
		listOfPerson.add(new PersonDto("pqr", 28));
		listOfPerson.add(new PersonDto("xyz", 27));

		listOfPerson.forEach(p -> System.out.println("Name :" + p.getName() + " | Age :" + p.getAge()));
		System.out.println("-------------------------------------------");

		// Java Program to demonstrate
		// Consumer's accept() method
		Consumer<PersonDto> personConsumer = (p) -> System.out
				.println("Name :" + p.getName() + " | Age :" + p.getAge());
		personConsumer.accept(new PersonDto("Sachin", 37));
		System.out.println("-------------------------------------------");

		Consumer<Integer> displayConsumer = (n) -> System.out.println("Display Number :" + n);
		displayConsumer.accept(10);
		System.out.println("-------------------------------------------");

		// list of numbers
		List<Integer> list = new ArrayList<Integer>();
		list.add(2);
		list.add(1);
		list.add(3);

		// Consumer to multiply 2 to every integer of a list
		Consumer<List<Integer>> modify = l -> {
			for (int i = 0; i < l.size(); i++) {
				l.set(i, 2 * l.get(i));
			}
		};

		// Consumer to display a list of numbers
		Consumer<List<Integer>> display = lst -> lst.stream().forEach(n -> System.out.println(n));

		// Implement modify using accept()
		modify.accept(list);
		// Implement dispList using accept()
		display.accept(list);
		System.out.println("-----------------------------------------------");
		// Java Program to demonstrate
		// Consumer's andThen() method
		modify.andThen(display).accept(list);
	}

}
