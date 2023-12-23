package com.startech.stream_api;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.startech.dto.Employee;

public class GroupByUsingMapAndJava8 {
	// Say, the task is to group an array of employee records into a data map
	// organized by Name or Salary.

	public static Map<String, List<Employee>> getListGroupByName(List<Employee> employees) {
		Map<String, List<Employee>> groupByName = new HashMap<>();
		for (int i = 0; i < employees.size(); i++) {
			Employee employee = employees.get(i);
			List<Employee> subList = groupByName.getOrDefault(employee.getName(), new ArrayList<>());
			subList.add(employee);
			groupByName.put(employee.getName(), subList);
		}
		return groupByName;
	}

	public static Map<String, List<Employee>> getListGroupByNameUsingJava8(List<Employee> employees) {
		return employees.stream().collect(Collectors.groupingBy(Employee::getName));
	}

	public static void main(String[] args) {
		Map<String, List<Employee>> listGroupByName = getListGroupByNameUsingJava8(Employee.getEmployees());
		System.out.println(listGroupByName);

	}

}
