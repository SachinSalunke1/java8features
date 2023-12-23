package com.startech.stream_api.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.startech.dto.Employee;

public class SortListWithLambdaExpression {

	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee(10, "Ramesh", 30, 400000));
		employees.add(new Employee(20, "Santosh", 29, 750000));
		employees.add(new Employee(30, "Sanjay", 30, 550000));
		employees.add(new Employee(40, "Pramod", 29, 500000));

		Collections.sort(employees, new Comparator<Employee>() {
			@Override
			public int compare(Employee e1, Employee e2) {
				return (int) (e1.getName().compareTo(e2.getName()));
			}
		});
		employees.forEach(System.out::println);
		System.out.println("-------------------------------------------");

		// using lambda expression
		// ascending order
		Collections.sort(employees,(e1,e2)->e1.getName().compareTo(e2.getName()));
		employees.forEach(System.out::println);
		System.out.println("-------------------------------------------");
		
		// descending order
		Collections.sort(employees,(e1,e2)-> e2.getName().compareTo(e1.getName()));
		employees.forEach(System.out::println);
		System.out.println("-------------------------------------------");
		
		// using Comparator.comparing() method
		Collections.sort(employees, Comparator.comparing(Employee::getAge));
		employees.forEach(System.out::println);
		System.out.println("-------------------------------------------");
		
		Collections.sort(employees,Comparator.comparing(Employee::getSalary, (s1,s2)->(int) (s2-s1)));
		employees.forEach(System.out::println);
		System.out.println("-------------------------------------------");
	}

}
