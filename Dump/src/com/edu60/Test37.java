package com.edu60;

public class Test37 {
	static int count = 0;
	int i = 0;

	public void changeCount() {
		while (i < 5) {
			i++;
			count++;
		}
	}
	
	public static void main(String[] args) {
		Test37 check1 = new Test37();
		Test37 check2 = new Test37();
		check1.changeCount();
		check2.changeCount();
		System.out.print(check1.count + ":" + check2.count);
		
	}
}
