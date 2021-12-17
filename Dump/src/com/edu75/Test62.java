package com.edu75;

public class Test62 {
	public static void main(String[] args) {
		int[] intArr = {8, 16, 32, 64, 128};
	
		// 확장for문
		for(int i : intArr) {
			System.out.print(i + " ");
		}
		
		// 일반for문
		for(int i = 0; i < intArr.length; i++) {
			System.out.print(intArr[i] + " ");
		}
		
		
		/*
		 * Which two code fragments, independently, 
		 * print each element in this array?
		 * -> 이 배열의 각 요소를 독립적으로 인쇄하는
		 * 두 개의 코드 조각은 무엇입니까?
		 * 
		 */
	}
}
