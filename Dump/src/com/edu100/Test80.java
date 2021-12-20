package com.edu100;

class Caller {
	private void init() {
		System.out.println("Initialized");
	}
	
	private void start() {
		init();
		System.out.println("Started");
	}
}

public class Test80 {
	public static void main(String[] args) {
		Caller c = new Caller();
		c.start();
		c.init();
		
		// Compilation fails
		// private method는 클래스 내부에서만 사용 가능
	}
}
