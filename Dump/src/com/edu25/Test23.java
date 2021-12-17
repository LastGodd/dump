package com.edu25;

public class Test23 {
	public static void main(String[] args) {
		int x = 100;
		int a = x++;
		int b = ++x;
		int c = x++;
		int d = (a<b) ? a : (a<c) ? b : (a<x) ? x : a;
		System.out.println(d);
		// 구문오류 삼항연산자를 중첩 사용하기 위해서는 거짓에 조건을 주어야 한다.
		// (조건) ? 참 : 거짓(조건) ? 참 : 거짓(조건)....
	}
}
