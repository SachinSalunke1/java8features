package com.startech.collection.aggrigate_operations;

import java.util.List;

import com.startech.dto.Person;

public class ForEachAggrigateOperation {

	public static void main(String[] args) {
		// prints the name of all members contained in the collection roster with a
		// for-each loop:
		List<Person> roster = Person.createRoster();
		for (Person person : roster) {
			System.out.println(person.getName());
		}
		System.out.println("-------------------------------------");

		// prints all members contained in the collection roster but with the aggregate
		// operation forEach:
		roster.stream().forEach(p -> System.out.println(p.getName()));
		System.out.println("-------------------------------------");

		// Let's Print the names of male members, for-each loop:
		for (Person person : roster) {
			if (person.getGender() == Person.Sex.MALE) {
				System.out.println(person.getName());
			}
		}
		System.out.println("-------------------------------------");
		
		//Print names of male members, forEach operation:
		roster.stream().filter(p->p.getGender()==Person.Sex.MALE).forEach(p->System.out.println(p.getName()));
		System.out.println("-------------------------------------");
	}

}
