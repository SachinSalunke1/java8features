package com.startech.default_methods;

public interface PoetDiamond {
	default void write() {
		System.out.println("Poet's default method");
	}
}
