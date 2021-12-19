package com.edu75;

import myException.MyException;

public class Test72 {
	public static void main(String[] args) {
		try {
			method1();
		} catch (MyException ne) {
			System.out.print("A");
		}
	}
	public static void method1() { // line n1
		try {
			throw Math.random() > 0.5 ? new MyException() : new RuntimeException();
		} catch( RuntimeException re) {
			System.out.print("B");
		}
	}
	// Either A or B
}