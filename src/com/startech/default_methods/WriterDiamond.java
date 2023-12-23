package com.startech.default_methods;

public interface WriterDiamond {
	default void write() {
		System.out.println("Writers's default method");
	}
}
