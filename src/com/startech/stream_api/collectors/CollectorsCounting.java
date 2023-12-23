package com.startech.stream_api.collectors;

import java.util.Map;
import java.util.stream.Collectors;

import com.startech.dto.Employee;

public class CollectorsCounting {

	public static void main(String[] args) {
		Map<String, Long> collect = Employee.getEmployees()
				.stream().collect(Collectors.groupingBy(Employee::getName,Collectors.counting()));
		System.out.println(collect);
	}

}
