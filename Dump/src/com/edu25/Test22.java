package com.edu25;

public class Test22 {

	public static void main(String[] args) {
		int num = 5;
		do {
			System.out.print(num-- + " ");
		} while(num == 0);
		
		// while(false)가 되면 종료
		// 따라서 5만 출력되고 종료
	}

}
