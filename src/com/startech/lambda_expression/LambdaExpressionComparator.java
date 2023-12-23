package com.startech.lambda_expression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.startech.dto.PersonDto;

public class LambdaExpressionComparator {

	public static void main(String[] args) {

		List<PersonDto> listOfPerson = new ArrayList<PersonDto>();
		listOfPerson.add(new PersonDto("abc", 27));
		listOfPerson.add(new PersonDto("mno", 26));
		listOfPerson.add(new PersonDto("pqr", 28));
		listOfPerson.add(new PersonDto("xyz", 27));

		// Without lambda expression.
		// Sort list by age
		
		Comparator<PersonDto> comparator = new Comparator<PersonDto>() {

			@Override
			public int compare(PersonDto o1, PersonDto o2) {
				return o1.getAge() - o2.getAge();
			}
		};
		
		Collections.sort(listOfPerson,comparator);
		System.out.println(" sort persons by age in ascending order");
		for (PersonDto person : listOfPerson) {
			System.out.println("Person Name :"+person.getName() );
		}
		System.out.println("-------------------------------------------");
		// With lambda expression.
		
		Comparator<PersonDto> comparator2 = (o1,o2)->{
			return o1.getAge() - o2.getAge();
		};
		 // Use forEach method added in java 8
        System.out.println(" sort persons by age in ascending order");
        
        listOfPerson.forEach((person) -> System.out.println("Person Name :"+person.getName()));

	}

}

