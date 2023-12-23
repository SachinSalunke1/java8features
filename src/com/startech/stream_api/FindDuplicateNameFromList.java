package com.startech.stream_api;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import com.startech.dto.Employee;

public class FindDuplicateNameFromList {

	public static Set<String> getDuplicateNameFromList1(List<Employee> list) {
		Set<String> set = new HashSet<>();
		// Find and print the duplicate names
		System.out.println("Duplicate Names:");
		for (int i = 0; i < list.size(); i++) {
			for (int j = i + 1; j < list.size(); j++) {
				if (list.get(i).getName().equals(list.get(j).getName())) {
					set.add(list.get(i).getName());
				}
			}
		}
		return set;
	}

	public static List<String> getDuplicateNameFromList2(List<Employee> list) {
		Map<String, Integer> map = new HashMap<>();
		for (Employee emp : list) {
			if (!map.containsKey(emp.getName())) {
				map.put(emp.getName(), 1);
			} else {
				map.put(emp.getName(), map.get(emp.getName()) + 1);
			}
		}
		// Find and print the duplicate names
		List<String> al = new ArrayList<>();
		System.out.println("Duplicate Names:");
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			if (entry.getValue() > 1) {
				al.add(entry.getKey());
			}
		}
		return al;
	}

	public static List<String> getDuplicateNameFromList3(List<Employee> list) {
		Map<String, Long> map = list.stream().collect(Collectors.groupingBy(Employee::getName, Collectors.counting()));
		System.out.println(map);
		// Find and print the duplicate names
		System.out.println("Duplicate Names:");
		List<String> collect = map.entrySet().stream().filter(e -> e.getValue() > 1).map(e -> e.getKey())
				.collect(Collectors.toList());
		return collect;
	}

	public static List<String> getDuplicateNameFromList4(List<Employee> list) {
		List<String> duplicates = new ArrayList<>();
		Set<String> set = new HashSet<>();
		for (Employee emp : list) {
			if (set.contains(emp.getName())) {
				duplicates.add(emp.getName());
			} else {
				set.add(emp.getName());
			}
		}
		return duplicates;
	}

	public static List<String> getDuplicateNameFromList5(List<Employee> list) {
		List<String> duplicates = new ArrayList<>();
		Map<String, Integer> frequencyMap = new HashMap<>();
		for (Employee emp : list) {
			frequencyMap.put(emp.getName(), frequencyMap.getOrDefault(emp.getName(), 0) + 1);
		}
		for (String name : frequencyMap.keySet()) {
			if (frequencyMap.get(name) != 1) {
				duplicates.add(name);
			}
		}
		return duplicates;
	}

	public static List<String> getDuplicateNameFromList6(List<Employee> list) {
		Set<String> duplicates = new HashSet<>();
		return list.stream().filter(e -> !duplicates.add(e.getName())).map(e -> e.getName())
				.collect(Collectors.toList());
	}

	public static List<String> getDuplicateNameFromList7(List<Employee> list) {
		return list.stream().filter(e -> Collections.frequency(list, e.getName()) > 1).map(e->e.getName())
				.collect(Collectors.toList());
	}

	public static void main(String[] args) {
		List<Employee> employees = Employee.getEmployees();
		System.out.println(getDuplicateNameFromList1(employees));
		System.out.println(getDuplicateNameFromList2(employees));
		System.out.println(getDuplicateNameFromList3(employees));
		System.out.println(getDuplicateNameFromList4(employees));
		System.out.println(getDuplicateNameFromList5(employees));
		System.out.println(getDuplicateNameFromList6(employees));
		System.out.println(getDuplicateNameFromList7(employees));
	}

}
