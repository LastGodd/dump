package com.edu75;

public class Test58 {
	String name;
	int age = 25;

	public Test58(String name) {
		this(); // line n1
		setName(name);
	}

	public Test58(String name, int age) {
		Person(name); // line n2
		setAge(age);
	}

	public String show() {
		return name + " " + age + " " + number;
	}

	public static void main(String[] args) {
		Test58 p1 = new Test58("Jesse");
		Test58 p2 = new Test58("Walter", 52);
		
	}
	
	// Compilation fails at both line n1 and line n2
}
