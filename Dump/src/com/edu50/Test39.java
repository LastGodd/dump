package com.edu50;

public class Test39 {

	public static void main(String[] args) {
		if(args[0].equals("Hello") ? false : true) {
			System.out.println("Success");
		} else {
			System.out.println("Failure");
		}
	}
	
	// Hello 문자열이 같을 경우 false를 반환함!! **함정 주의**
}
