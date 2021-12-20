package com.edu100;

class Employee {
	public int salary;
}

class Manager extends Employee {
	public int budget;
}

class Director extends Manager {
	public int stockOptions;
}

public class Test77 {
	public static void main(String[] args) {
		Employee employee = new Employee();
		Manager manager = new Manager();
		Director director = new Director();
		// line n1
		/*
		 * Which two options fail to compile when placed at line n1 
		 * of the main method?
		 * -> 메인 메소드의 n1 줄에 배치되었을 때 컴파일하지 못하는 두 가지 옵션은?
		 * 
		 * C. employee.budget = 200_000;
		 * E. manager.stockOption = 500;
		 * 
		 */
	}
}
