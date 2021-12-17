package com.edu75;

public class Test70 {
	public static void main(String[] args) {
		// line n1
//		Byte x = 1; // ok
//		short x = 1; // ok
//		String x = "1"; // no
//		Long x = 1; // no
//		Double x = 1; // no
		Integer x = new Integer("1"); //ok
		
		switch(x) {
		case 1: 
			System.out.println("One");
			break;
		case 2:
			System.out.println("Two");
			break;
		}
		/*
		 * Which three code fragments can be independently 
		 * inserted at line n1 to enable the code to print one?
		 * ->어떤 세 개의 코드 조각을 n1줄에 독립적으로 삽입하여 코드를 인쇄할 수 있습니까
		 * 
		 * 
		 */
	}
}
