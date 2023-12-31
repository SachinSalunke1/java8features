package com.startech.collectors_class;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import com.startech.dto.Product;

public class CollectorsToListToSetExample {

	public static void main(String[] args) {
		List<Product> productsList = new ArrayList<Product>();  
        //Adding Products  
        productsList.add(new Product(1,"HP Laptop",25000f));  
        productsList.add(new Product(2,"Dell Laptop",30000f));  
        productsList.add(new Product(3,"Lenevo Laptop",28000f));  
        productsList.add(new Product(4,"Sony Laptop",28000f));  
        productsList.add(new Product(5,"Apple Laptop",90000f));  
        
        // Collectors.toList        
        List<Float> productPriceList = productsList.stream().map(x->x.getPrice()).collect(Collectors.toList());
        System.out.println(productPriceList);
        System.out.println("-----------------------------------------------------------");
        // Collectors.toSet  
        Set<Float>productPriceSet = productsList.stream().map(x->x.getPrice()).collect(Collectors.toSet());
        System.out.println(productPriceSet);
        System.out.println("-----------------------------------------------------------");
	}

}
