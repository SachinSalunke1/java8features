package com.startech.stream_api.collectors;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;

import com.startech.dto.Employee;

public class CollectorsMaxBY {

	public static void main(String[] args) {
		System.out.println(Employee.getEmployees());
		Optional<String> maxByNatural = Employee.getEmployees().stream().map(Employee::getName)
				.collect(Collectors.maxBy(Comparator.naturalOrder()));
		Optional<String> maxByReverse = Employee.getEmployees().stream().map(Employee::getName)
				.collect(Collectors.maxBy(Comparator.reverseOrder()));
		if (maxByNatural.isPresent()) {
			System.out.println(maxByNatural);
			System.out.println(maxByReverse);
		} else {
			System.out.println("No value");
		}
		Optional<String> minByNatural = Employee.getEmployees().stream().map(Employee::getName)
				.collect(Collectors.minBy(Comparator.naturalOrder()));
		Optional<String> minByReverse = Employee.getEmployees().stream().map(Employee::getName)
				.collect(Collectors.minBy(Comparator.reverseOrder()));
		if (minByNatural.isPresent()) {
			System.out.println(minByNatural);
			System.out.println(minByReverse);
		} else {
			System.out.println("No value");
		}
	}

}
