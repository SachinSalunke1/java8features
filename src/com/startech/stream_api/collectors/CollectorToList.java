package com.startech.stream_api.collectors;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import com.startech.dto.Employee;

public class CollectorToList {

	public static List<String> getEmployeeListAgeLimit(List<Employee> employees) {
		List<String> collect = employees.stream().filter(e -> e.getAge() > 35).map(e -> e.getName())
				.collect(Collectors.toList());
		return collect;
	}
	public static Set<String> getEmployeeSetAgeLimit(List<Employee> employees) {
		Set<String> collect = employees.stream().filter(e -> e.getAge() > 35).map(e -> e.getName())
				.collect(Collectors.toSet());
		return collect;
	}
	
	public static Map<String,Integer> getEmployeeMapAgeLimit(List<Employee> employees) {
		Map<String, Integer> collect = employees.stream().filter(e -> e.getAge() > 35).collect(Collectors.toMap(Employee::getName, Employee::getAge,(key,identicalKey)-> key));
		return collect;
	}

	public static void main(String[] args) {
		List<Employee> employees = Employee.getEmployees();
		List<String> employeeListAgeLimit = getEmployeeListAgeLimit(employees);
		Set<String> employeeSetAgeLimit = getEmployeeSetAgeLimit(employees);	
		Map<String, Integer> employeeMapAgeLimit = getEmployeeMapAgeLimit(employees);
		System.out.println(employeeListAgeLimit);
		System.out.println(employeeSetAgeLimit);
		System.out.println(employeeMapAgeLimit);
	}

}
