package com.startech.stream_api.collectors;

import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

import com.startech.dto.Employee;

public class CollectorsSummarizingDouble {

	public static void main(String[] args) {
		List<Employee> employees = Employee.getEmployees();
		DoubleSummaryStatistics collect = employees.stream().collect(Collectors.summarizingDouble(Employee::getSalary));
		System.out.println("No of records :" + collect.getCount());
		System.out.println("Sum of records :" + collect.getSum());
		System.out.println("Min Value records :" + collect.getMin());
		System.out.println("Max Value records :" + collect.getMax());
		System.out.println("Avg Value records :" + collect.getAverage());
		System.out.println("----------------------------------------------------");

		DoubleSummaryStatistics collect1 = employees.stream().mapToDouble(Employee::getSalary).summaryStatistics();
		System.out.println("No of records :" + collect1.getCount());
		System.out.println("Sum of records :" + collect1.getSum());
		System.out.println("Min Value records :" + collect1.getMin());
		System.out.println("Max Value records :" + collect1.getMax());
		System.out.println("Avg Value records :" + collect1.getAverage());
	}

}
