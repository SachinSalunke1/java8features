package com.startech.fi.supplier;

import java.util.function.Supplier;

import com.startech.dto.User;

public class SupplierFunctionaInterface {

	public static void main(String[] args) {
		
		Supplier<Double> randomValue = ()-> Math.random();
		System.out.println("Random Value :"+randomValue.get());
		System.out.println("-------------------------------------");
		
		Supplier<User> user = () -> new User("Ramesh", "Admin");
		User user1 = user.get();
		System.out.println("Name : "+user1.getName()+" | Role :"+user1.getRole());
		System.out.println("-------------------------------------");
	}

}
