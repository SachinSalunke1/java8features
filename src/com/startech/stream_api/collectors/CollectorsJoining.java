package com.startech.stream_api.collectors;

import java.util.stream.Collectors;

import com.startech.dto.Employee;

public class CollectorsJoining {

	public static void main(String[] args) {
		String collect1 = Employee.getEmployees().stream().filter(e->e.getAge()>32).map(Employee::getName).collect(Collectors.joining(" "));
		System.out.println(collect1);
		String collect2 = Employee.getEmployees().stream().filter(e->e.getAge()>32).map(e->e.getName()).collect(Collectors.joining(", ", "Prefix :", ": suffix"));
		System.out.println(collect2);
	}

}
