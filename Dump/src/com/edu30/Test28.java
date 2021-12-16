package com.edu30;

class Test28 {
	static int i;
	int j;

	public static void main(String[] args) {
		Test28 x1 = new Test28();
		Test28 x2 = new Test28();
		x1.j = 3;
		x1.j = 4;
		x2.i = 5;
		x2.j = 6;
		System.out.println(x1.i + " " + x1.j + " " + x2.i + " " + x2.j);
		// 5 4 5 6
	}

}
