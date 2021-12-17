package com.edu50;

public class Test38 {
	public static void main(String[] args) {
		double discount = 0;
		int qty = Integer.parseInt(args[0]);
		// line n1
//		if (qty >= 90) {
//			discount = 0.5;
//		}
//		if (qty > 80 && qty < 90) {
//			discount = 0.2;
//		}

//		discount = (qty >= 90) ? 0.5 : (qty > 80) ? 0.2 : 0;
		
		System.out.println("qty: " + qty);
		System.out.println("discount: " + discount);
		/*
		 * If the value of the qty variable is greater than or equal to 90, discount =
		 * 0.5 qty변수의 값이 90보다 크거나 같으면 discount = 0.5
		 * 
		 * 
		 * If the value of the qty variable is between 80 and 90, discount = 0.2 qty변수의
		 * 값이 80과 90 사이이면 discount = 0.2
		 * 
		 * Which two code fragments can be independently placed at line n1 to meet the
		 * requirements?
		 * 
		 * 요구사항을 충족하기 위해 n1 라인에 독립적으로 배치될 수 있는 코드 조각 두 개
		 * 
		 * 
		 */
	}
}
