package com.edu25;

class Product {
	double price;
}

public class Test01 {
	public void updatePrice(Product product, double price) {
		price = price * 2;
		product.price = product.price + price;
	}
	
	public static void main(String[] args) {
		Product prt = new Product();
		prt.price = 200;
		double newPrice = 100;
		
		Test01 t = new Test01();
		t.updatePrice(prt, newPrice);
		System.out.println(prt.price + " : " + newPrice);
	}
}
