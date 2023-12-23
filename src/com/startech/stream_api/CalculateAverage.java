package com.startech.stream_api;

import java.util.List;
import java.util.stream.Collectors;

import com.startech.dto.Employee;

public class CalculateAverage {
	public static double getAverage(List<Employee> empList) {
		long sum = 0;
		double avg = 0;
		for (int i = 0; i < empList.size(); i++) {
			Employee employee = empList.get(i);
			sum += employee.getSalary();
		}
		avg = sum / empList.size();
		return avg;
	}
	public static double getAverageByUsingJava8(List<Employee> empList) {		
		return empList.stream().collect(Collectors.averagingDouble(Employee::getSalary));
	}


	public static void main(String[] args) {
		List<Employee> employees = Employee.getEmployees();
		double average1 = getAverage(employees);
		double average2 = getAverageByUsingJava8(employees);
		System.out.println(average1);
		System.out.println(average2);
	}

}
