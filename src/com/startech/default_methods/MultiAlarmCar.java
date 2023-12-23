package com.startech.default_methods;

public class MultiAlarmCar implements Vehicle, Alarm{

	private final String brand;

	public MultiAlarmCar(String brand) {
		super();
		this.brand = brand;
	}

	@Override
	public String getBrand() {
		// TODO Auto-generated method stub
		return brand;
	}

	@Override
	public String speedUp() {
		// TODO Auto-generated method stub
		return  "The motorbike is speeding up.";
	}

	@Override
	public String slowDown() {
		// TODO Auto-generated method stub
		return "The mootorbike is slowing down.";
	}
	//To solve this ambiguity, we must explicitly provide an implementation for the methods:
	
	/*@Override
	public String turnAlarmOn() {
	    // custom implementation
		return Vehicle.super.turnAlarmOn();
	}
	     
	@Override
	public String turnAlarmOff() {
	    // custom implementation
		return Vehicle.super.turnAlarmOff();
	}*/
	
	//We can also have our class use the default methods of one of the interfaces.
	/*@Override
	public String turnAlarmOn() {
	    return Vehicle.super.turnAlarmOn();
	}
	 
	@Override
	public String turnAlarmOff() {
	    return Vehicle.super.turnAlarmOff();
	}*/
	
	//Similarly, we can have the class use the default methods defined within the AlarmInterface:
	/*@Override
	public String turnAlarmOn() {
	    return Alarm.super.turnAlarmOn();
	}
	 
	@Override
	public String turnAlarmOff() {
	    return Alarm.super.turnAlarmOff();
	}*/
	
	//Furthermore, it’s even possible to make the Car class use both sets of default methods:
	@Override
	public String turnAlarmOn() {
	    return Vehicle.super.turnAlarmOn() + " " + Alarm.super.turnAlarmOn();
	}
	     
	@Override
	public String turnAlarmOff() {
	    return Vehicle.super.turnAlarmOff() + " " + Alarm.super.turnAlarmOff();
	}
}
