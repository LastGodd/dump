package com.edu30;

public class Test04 {
	public static void main(String[] args) {
		short s1 = 200;
		Integer s2 = 400;
		Long s3 = (long) s1 + s2;
		//String s4 = (String) (s3 * s2);
		// 문자열로 바꾸고 싶으면 두 가지 방법
		// String s4 = String.valueOf((s3 * s2));
		// String s4 = "" + (s3 * s2);
		// System.out.println("sum is " + s4);
	}
}
