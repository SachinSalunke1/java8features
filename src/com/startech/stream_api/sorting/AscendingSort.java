package com.startech.stream_api.sorting;

import java.util.Comparator;

import com.startech.dto.Employee;

public class AscendingSort implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		return (int) (o1.getSalary() - o2.getSalary());
	}

}
