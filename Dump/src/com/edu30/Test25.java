package com.edu30;

public class Test25 {
	String name;
	boolean contract;
	double salary;

	Test25() {
		// line n1
		this.name = new String("Joe");
		this.contract = new Boolean(true);
		this.salary = new Double(100);
	}

	
	
	@Override
	public String toString() {
		return name + ":" + contract + ":" + salary;
	}



	public static void main(String[] args) {
		Test25 e = new Test25();
		// line n2
//		e.name = "Joe";
//		e.contract = true;
//		e.salary = 100;
		
		System.out.print(e);
		// joe:ture:100.0
	}

}
