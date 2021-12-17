package com.edu25;

class CD {
	int r;
	CD(int r){
		this.r=r;
	}
}

class DVD extends CD {
	int c;
	DVD(int r, int c) {
		super(r);
		this.c = c;
	}
}

public class Test13 {
	public static void main(String[] args) {
		DVD dvd = new DVD(10,20);
	}
}
