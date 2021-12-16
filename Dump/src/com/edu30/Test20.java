package com.edu30;

public class Test20 {
	public static void main(String[] args) {
		int x = 5;
		while(isVailable(x)) {
			System.out.print(x);
			--x;
		}
	}
	
	public static boolean isVailable(int x) {
		return x-- > 0 ? true : false;
	}
}
