package com.startech.stream_api;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import com.startech.dto.Product;

public class FilteringCollectionUsingStream {

	private static List<Product> productsList = new ArrayList<>();

	public static void main(String[] args) {
		productsList.add(new Product(1, "HP Laptop", 25000f));
		productsList.add(new Product(2, "Dell Laptop", 30000f));
		productsList.add(new Product(3, "Lenevo Laptop", 28000f));
		productsList.add(new Product(4, "Sony Laptop", 28000f));
		productsList.add(new Product(5, "Apple Laptop", 90000f));

		// 1. Filtering Collection without using Stream
		List<Float> productPriceList = new ArrayList<>();
		for (Product prod : productsList) {
			if (prod.getPrice() > 25000) {
				productPriceList.add(prod.getPrice());
			}
		}
		for (Float price : productPriceList) {
			System.out.println("Price :" + price);
		}
		System.out.println("----------------------------------------------");

		// 2. Filtering Collection by using Stream
		List<Float> priceList = productsList.stream().filter(prod -> prod.getPrice() > 25000).map(pro -> pro.getPrice())
				.collect(Collectors.toList());
		priceList.forEach(System.out::println);
		System.out.println("----------------------------------------------");

		// 3. Filtering and Iterating Collection
		productsList.stream().filter(p -> p.getPrice() > 28000).forEach(p -> System.out.println(p.getPrice()));
		System.out.println("----------------------------------------------");

		// 4. Sum by using Collectors Methods
		Double total = productsList.stream().filter(p -> p.getPrice() > 28000)
				.collect(Collectors.summingDouble(p -> p.getPrice()));
		System.out.println("Total :" + total);
		System.out.println("----------------------------------------------");
		Double price = productsList.stream().collect(Collectors.summingDouble(p -> p.getPrice()));
		System.out.println("Total All:" + price);
		System.out.println("----------------------------------------------");

		// 5. Java Stream Example: Find Max and Min Product Price
		Product max = productsList.stream().max((p1, p2) -> p1.getPrice() > p2.getPrice() ? 1 : -1).get();
		System.out.println("Max Product :" + max.getName() + " | " + max.getPrice());
		Product min = productsList.stream().min((p1, p2) -> p2.getPrice() < p1.getPrice() ? 1 : -1).get();
		System.out.println("Min Product :" + min.getName() + " | " + min.getPrice());
		System.out.println("----------------------------------------------");

		// 6. Java Stream Example: Convert List into Set
		Set<Float> priceSet = productsList.stream().filter(p -> p.getPrice() > 25000).map(p -> p.getPrice())
				.collect(Collectors.toSet());
		System.out.println("Price set :" + priceSet);
		System.out.println("----------------------------------------------");
		
		//7. Java Stream Example: Convert List into Map
		Map<Integer, String> mapPrice = productsList.stream().collect(Collectors.toMap(p->p.getId(), p->p.getName()));
		System.out.println(mapPrice);
		System.out.println("----------------------------------------------");
		
		//8. Using Method References in Stream Examples
		List<Float> methodRef = productsList.stream().filter(p->p.getPrice()>25000).map(Product::getPrice).collect(Collectors.toList());
		System.out.println(methodRef);
		System.out.println("----------------------------------------------");

	}

}
