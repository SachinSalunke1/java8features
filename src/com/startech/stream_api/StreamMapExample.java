package com.startech.stream_api;

import java.util.List;
import java.util.stream.Collectors;

import com.startech.dto.Employee;

public class StreamMapExample {

	public static void main(String[] args) {
		List<Employee> employees = Employee.getEmployees();
		List<String> collect = employees.stream().map(e->String.valueOf(e.getAge())).collect(Collectors.toList());
		System.out.println(collect);

	}

}
