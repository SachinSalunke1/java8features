package com.startech.stream_api.collectors;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.startech.dto.Employee;

public class CollectorsPartitioningBy {

	public static void main(String[] args) {
		Map<Boolean, List<Employee>> collect = Employee.getEmployees().stream().collect(Collectors.partitioningBy(e->e.getSalary()>150000));
		System.out.println(collect);

	}

}
