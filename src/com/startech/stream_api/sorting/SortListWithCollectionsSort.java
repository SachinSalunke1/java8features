package com.startech.stream_api.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.startech.dto.Employee;

public class SortListWithCollectionsSort {

	public static void main(String[] args) {
		//Integer List
		List < Integer > list = new ArrayList < Integer > ();
        list.add(10);
        list.add(30);
        list.add(20);
        list.add(50);
        list.add(40);
        
        Collections.sort(list); // ascending order
        System.out.println(list);
        Collections.reverse(list); // descending
        System.out.println(list);  
        System.out.println("--------------------------------------------------------");
        
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(10, "Ramesh", 30, 400000));
        employees.add(new Employee(20, "Santosh", 29, 350000));
        employees.add(new Employee(30, "Sanjay", 30, 450000));
        employees.add(new Employee(40, "Pramod", 29, 500000));
        
        Collections.sort(employees, new AscendingSort());
        employees.forEach(System.out::println);        
        System.out.println("--------------------------------------------------------");
        
        Collections.sort(employees, new DescendingSort());
        employees.forEach(System.out::println);
        System.out.println("--------------------------------------------------------");
	}

}
