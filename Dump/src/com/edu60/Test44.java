package com.edu60;

class Base {
	public void test() {
		System.out.println("Base ");
	}
}

class DerivedA extends Base {
	public void test() {
		System.out.println("DerivedA");
	}
}

class Test44 extends DerivedA {
	public void test() {
		System.out.println("DerivedB");
	}

	public static void main(String[] args) {
		Base b1 = new Test44();
		Base b2 = new DerivedA();
		Base b3 = new Test44();
		b1 = (Base)b3;
		Base b4 = (DerivedA) b3;
		b1.test();
		b4.test();
		// DerivedB
		// DerivedB
		
	}
}
