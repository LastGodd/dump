package com.edu30;

class A {
	
	public A() {
		System.out.print("A ");
	}
}

class B extends A {
	
	public B() {
		System.out.print("B ");
	}
}

class Test27 extends B{
	public Test27() {
		System.out.print("C ");
	}
	
	public static void main(String[] args) {
		Test27 c = new Test27();
	}
}
