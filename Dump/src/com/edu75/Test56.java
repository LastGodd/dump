package com.edu75;

public class Test56 {
	public static void main(int[] args) {
		System.out.println("int main " + args[0]);
	}

	public static void main(Object[] args) {
		System.out.println("Object main " + args[0]);
	}

	public static void main(String[] args) {
		System.out.println("String main " + args[0]);
	}
	
	// args입력 : 1 2 3 -> print : String main 1
}
