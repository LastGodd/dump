package com.edu25;

class Vehicle {
	String type = "4W";
	int maxSpeed = 100;

	Vehicle(String type, int maxSpeed) {
		this.type = type;
		this.maxSpeed = maxSpeed;
	}
}

class Test07 extends Vehicle {
	String trans;

	Test07(String trans) {
		this.trans = trans;
	}

	Test07(String type, int maxSpeed, String trans) {
		super(type, maxSpeed);
		this(trans);
	}
}
