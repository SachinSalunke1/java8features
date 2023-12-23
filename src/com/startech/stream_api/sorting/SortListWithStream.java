package com.startech.stream_api.sorting;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.startech.dto.Employee;

public class SortListWithStream {

	public static void main(String[] args) {

		List<String> fruits = new ArrayList<String>();
		fruits.add("Banana");
		fruits.add("Apple");
		fruits.add("Mango");
		fruits.add("Orange");
		
		// Ascending order
		List<String> naturalOrder = fruits.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
		System.out.println(naturalOrder);
		System.out.println("---------------------------------------------------------");
		
		List<String> sortedList1 = fruits.stream().sorted((o1,o2)-> o1.compareTo(o2)).collect(Collectors.toList());
		System.out.println(sortedList1);
		System.out.println("---------------------------------------------------------");
		
		List<String> sortedList2 = fruits.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedList2);
		System.out.println("---------------------------------------------------------");
		
		// descending order
		List<String> reverseOrder = fruits.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(reverseOrder);
		System.out.println("---------------------------------------------------------");
		
		List<String> sortedList3 = fruits.stream().sorted((o1,o2)->o2.compareTo(o1)).collect(Collectors.toList());
		System.out.println(sortedList3);
		System.out.println("---------------------------------------------------------");
		System.out.println("---------------------------------------------------------");
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee(10, "Ramesh", 30, 400000));
		employees.add(new Employee(20, "Santosh", 29, 750000));
		employees.add(new Employee(30, "Sanjay", 30, 550000));
		employees.add(new Employee(40, "Pramod", 29, 500000));
		
		List<Employee> sortedBySalary = employees.stream().sorted((o1,o2)->(int)( o1.getSalary()-o2.getSalary())).collect(Collectors.toList());
		sortedBySalary.forEach(System.out::println);
		System.out.println("---------------------------------------------------------");
		
		List<Employee> sortedBySalary1 = employees.stream().sorted((o1,o2)-> (int)(o2.getSalary()-o1.getSalary())).collect(Collectors.toList());
		sortedBySalary1.forEach(System.out::println);
		System.out.println("---------------------------------------------------------");
		
		List<Employee> sortedBySalary2 = employees.stream().sorted(Comparator.comparingLong(Employee::getSalary).reversed()).collect(Collectors.toList());
		sortedBySalary2.forEach(System.out::println);
		System.out.println("---------------------------------------------------------");
	}

}
