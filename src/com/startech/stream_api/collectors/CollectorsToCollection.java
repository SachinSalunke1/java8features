package com.startech.stream_api.collectors;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.startech.dto.Employee;

public class CollectorsToCollection {

	public static void getlistToCollection(List<Employee> list) {
		System.out.println(list.stream().filter(e -> e.getAge() > 33).map(e -> e.getName())
				.collect(Collectors.toCollection(ArrayList::new)));

	}

	public static void main(String[] args) {
		List<Employee> employees = Employee.getEmployees();
		getlistToCollection(employees);
	}

}
