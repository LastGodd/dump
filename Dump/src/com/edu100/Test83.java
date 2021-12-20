package com.edu100;

public class Test83 {
	private char var;

	public static void main(String[] args) {
		char var1 = 'a';
		char var2 = var1;
		var2 = 'e';

		Test83 obj1 = new Test83();
		Test83 obj2 = obj1; // obj1 -> obj2 같은 곳을 참조하고 있다
		obj1.var = 'i';
		obj2.var = 'o';

		System.out.println(var1 + ", " + var2); // a, e
		System.out.print(obj1.var + ", " + obj2.var); // o, o
		//
	}
}
