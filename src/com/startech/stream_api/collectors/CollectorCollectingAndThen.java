package com.startech.stream_api.collectors;

import java.util.Map;
import java.util.stream.Collectors;

import com.startech.dto.Employee;

public class CollectorCollectingAndThen {

	public static void main(String[] args) {
		Map<String, Integer> collect = Employee.getEmployees()
				.stream()
				.collect(Collectors.groupingBy(Employee::getName,Collectors.collectingAndThen(Collectors.counting(), f->f.intValue())));
		System.out.println(collect);
	}

}
