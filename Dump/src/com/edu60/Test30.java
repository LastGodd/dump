package com.edu60;

public class Test30 {
	public static void main(String[] args) {
		String[] arr = { "A", "B", "C", "D" };
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
			if(arr[i].equals("c")) {
				continue;
			}
			System.out.println("Work done");
			break;
		}
		
		// A Work done
	}
}
