package com.edu75;

class MyString {
	String msg;

	MyString(String msg) {
		this.msg = msg;
	}
}

public class Test54 {
	public static void main(String[] args) {
		System.out.println("Hello " + new StringBuilder("Java SE 8"));
		System.out.println("Hello " + new MyString("Java SE 8"));
		
		// Hello Java SE 8
		// Hello com.edu60.MyString@<<hashcode>>
	}
}
