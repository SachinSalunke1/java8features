package com.startech.static_methods;

import com.startech.default_methods.Car;
import com.startech.default_methods.Vehicle;

public class StaticMethodExample {

	public static void main(String[] args) {
		Vehicle car = new Car("BMW");
		System.out.println(car.getBrand());
		System.out.println(car.speedUp());
		System.out.println(car.slowDown());
		System.out.println(car.turnAlarmOn());
		System.out.println(car.turnAlarmOff());
		System.out.println(Vehicle.getHorsePower(2500, 480));
	}

}
