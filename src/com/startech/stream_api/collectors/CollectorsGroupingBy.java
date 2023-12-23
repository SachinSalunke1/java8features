package com.startech.stream_api.collectors;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.startech.dto.Employee;

public class CollectorsGroupingBy {

	public static void main(String[] args) {
		Map<String, List<Employee>> collect = Employee.getEmployees().stream().collect(Collectors.groupingBy(Employee::getName));
		System.out.println(collect);
	}

}
