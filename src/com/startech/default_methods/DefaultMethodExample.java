package com.startech.default_methods;

public class DefaultMethodExample {

	public static void main(String[] args) {
		Vehicle car = new Car("TATA");
		System.out.println("Brand :" + car.getBrand());
		System.out.println("Speed Up:" + car.speedUp());
		System.out.println("Speed Down:" + car.slowDown());
		System.out.println("Alarm On:" + car.turnAlarmOn());
		System.out.println("Alarm Off:" + car.turnAlarmOff());
		System.out.println("Engine Power :" + Vehicle.getHorsePower(2500, 480));

		System.out.println("----------------------------------------------------");

		Vehicle bike = new MotorBike("Activa 5G");
		System.out.println(bike.getBrand());
		System.out.println(bike.speedUp());
		System.out.println(bike.slowDown());
		System.out.println(bike.turnAlarmOn());
		System.out.println(bike.turnAlarmOff());
		System.out.println(Vehicle.getHorsePower(2500, 480));
	}

}
