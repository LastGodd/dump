package com.edu50;

public class Test49 {

	public static void main(String[] args) {
		String str = " ";
		str.trim();
		System.out.println(str.equals("") + " " + str.isEmpty());
	}

	// "" <- null, " " <- 공백
	// false false
}
