package com.startech.collection.aggrigate_operations;

import java.util.List;

import com.startech.dto.Person;

public class PipelineSequenceAggrigateOperation {

	public static void main(String[] args) {

		List<Person> roster = Person.createRoster();

		// prints the male members contained in the collection roster with a pipeline
		// that consists of the aggregate operations filter and forEach:

		roster.stream().filter(p -> p.getGender() == Person.Sex.MALE).forEach(p -> System.out.println(p.getName()));
		System.out.println("------------------------------------------------");

		// A pipeline contains the following components:
		// A source: This could be a collection, an array, a generator function, or an
		// I/O channel
		// Zero or more intermediate operations - An intermediate operation, such as
		// filter, produces a new stream.
		// terminal operation - A terminal operation, such as forEach, produces a
		// non-stream result, such as a primitive value (like a double value), a
		// collection, or in the case of forEach, no value at all.
	}

}
