package com.startech.interview_program;

import java.util.HashMap;

public class ProductInventory {

	public static void main(String[] args) {
		HashMap<String, Integer> inventory = new HashMap<>();
		inventory.put("Laptop", 10);
		inventory.put("Phone", 20);
		
		//Sell Laptop
		Integer put = inventory.put("Laptop", inventory.get("Laptop")-1);
		System.out.println("Remaining laptops: " + inventory.get("Laptop"));
	}

}
