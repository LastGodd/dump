package com.edu75;

public class Test68 {
	int num;

	public static void graceMarks(Test68 obj4) {
		obj4.num += 10;
	}

	public static void main(String[] args) {
		Test68 obj1 = new Test68();
		Test68 obj2 = obj1;
		Test68 obj3 = null;
		obj2.num = 60;
		graceMarks(obj2);

	}
	
	/*
	 * How many MarkList(Test67) instances are created 
	 * in memory at runtime?
	 * -> 런타임 메모리에 몇 개의 MarkList 인스턴스가 생성됩니까?
	 * 1개
	 * 
	 */
}
