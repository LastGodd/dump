package com.edu75;

class Vehicle {
	int x;

	Vehicle() {
		this(10); // line n1
	}

	Vehicle(int x) {
		this.x = x;
	}
}

public class Test53 extends Vehicle {
	int y;

	Test53() {
		super();
		this(20); // line n2
		// 생성자에서 다른 생성자를 호출하기 위해서는 가장 윗줄에 작성해야하며,
		// 다른 생성자를 호출하는 것은 1회만 가능
	}
	
	Test53(int y) {
		this.y = y;
	}
	
	public String toString() {
		return super.x + ":" + this.y; 
	}
	public static void main(String[] args) {
		Vehicle y = new Test53();
		System.out.println(y);
	}
}
