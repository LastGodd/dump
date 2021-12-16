package com.edu30;

class Customer {
	ElectricAccount acct = new ElectricAccount();
	
	public void useElectricity(double kwh) {
		acct.addKWH(kwh);
	}
}

class ElectricAccount {
	private double kwh;
	private double rate = 0.07;
	private double bill;
	
//	public void addKWH(double kwh) {
//		this.kwh += kwh;
//		this.bill = this.kwh * this.rate;
//		System.out.println("kwh: " + this.kwh);
//		System.out.println("bill: " + this.bill);
//	}
	
	public void addKWH(double kwh) {
		if(kwh > 0) {
			this.kwh += kwh;
			this.bill = this.kwh * this.rate;
			System.out.println("kwh: " + this.kwh);
			System.out.println("bill: " + this.bill);
		}
	}
	
//	private void addKWH(double kwh) {
//		if(kwh > 0) {
//			this.kwh = kwh;
//			this.bill = this.kwh * this.rate;
//			System.out.println("kwh: " + this.kwh);
//			System.out.println("bill: " + this.bill);
//		}
//	}
	
//	public void addKWH(double kwh) {
//		if(kwh > 0) {
//			this.kwh = kwh;
//			setBill(this.kwh);
//			System.out.println("kwh: " + this.kwh);
//			System.out.println("bill: " + this.bill);
//		}
//	}
	
}

public class Test09 {
	public static void main(String[] args) {
		Customer ct = new Customer();
		ct.useElectricity(22.5);
	}
}
