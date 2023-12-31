package com.startech.collectors_class;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.startech.dto.Product;

public class CollectorsUsingSumAvgCount {

	public static void main(String[] args) {
		List<Product> productsList = new ArrayList<Product>();  
        //Adding Products  
        productsList.add(new Product(1,"HP Laptop",25000f));  
        productsList.add(new Product(2,"Dell Laptop",30000f));  
        productsList.add(new Product(3,"Lenevo Laptop",28000f));  
        productsList.add(new Product(4,"Sony Laptop",28000f));  
        productsList.add(new Product(5,"Apple Laptop",90000f));  
        
        Double sumPrice = productsList.stream().collect(Collectors.summingDouble(x->x.getPrice()));
        System.out.println("Sum of prices: "+sumPrice);  
        System.out.println("---------------------------------------------------");
        
        Integer sumId = productsList.stream().collect(Collectors.summingInt(x->x.getId()));
        System.out.println("Sum of id's: "+sumId);  
        System.out.println("---------------------------------------------------");
        
        Double avgPrice = productsList.stream().collect(Collectors.averagingDouble(x->x.getPrice()));
        System.out.println("Average of price :"+avgPrice);
        System.out.println("---------------------------------------------------");
        
        Long count = productsList.stream().collect(Collectors.counting());
        System.out.println("Total Element :"+count);
        System.out.println("---------------------------------------------------");
	}

}
