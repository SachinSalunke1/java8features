package com.startech.dto;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	private int id;
	private String name;
	private int age;
	private long salary;
	public Employee(int id, String name, int age, long salary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}
	
	public static List<Employee> getEmployees() {
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee(101, "ABC", 32, 140000));
		employees.add(new Employee(102, "PQR", 28, 120000));
		employees.add(new Employee(103, "STU", 25, 100000));
		employees.add(new Employee(104, "LMN", 37, 200000));
		employees.add(new Employee(105, "XYZ", 33, 150000));
		employees.add(new Employee(106, "ABC", 30, 140000));
		employees.add(new Employee(107, "PQR", 35, 180000));
		employees.add(new Employee(108, "STU", 40, 250000));
		employees.add(new Employee(109, "LMN", 36, 200000));
		employees.add(new Employee(110, "XYZ", 29, 120000));
		return employees;
	}
	
}
