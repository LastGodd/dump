package com.edu30;

class CheckingAccount {
	public int amount;
	public CheckingAccount(int amount) {
		this.amount = amount;
	}
	
	public int getAmount() {
		return amount;
	}
	
	public void changeAmont(int x) {
		amount += x;
	}
}

public class Test17 {
	public static void main(String[] args) {
		CheckingAccount acct = new CheckingAccount((int)(Math.random()*1000));
		// line n1
		// acct.amount = 0;
		// acct.changeAmont(-acct.amount);
		// acct.changeAmont(-acct.getAmount());
		System.out.println(acct.getAmount());
	}
	
}
