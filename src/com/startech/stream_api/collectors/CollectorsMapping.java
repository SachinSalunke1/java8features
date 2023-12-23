package com.startech.stream_api.collectors;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.startech.dto.Employee;

public class CollectorsMapping {

	public static void main(String[] args) {
		Map<String, List<Long>> collect = Employee.getEmployees().stream().filter(e -> e.getSalary() > 150000).collect(
				Collectors.groupingBy(Employee::getName, Collectors.mapping(Employee::getSalary, Collectors.toList())));
		System.out.println(collect);
	}

}
