package com.edu50;

public class Test42 {
	public static String maskCC(String creditCard) {
		String x = "XXXX-XXXX-XXXX-";
		// line n1

		return x + creditCard.substring(15, 19);

//		StringBuilder sb = new StringBuilder(x);
//		sb.append(creditCard, 15, 19);
//		return sb.toString();
	}

	// substring(start) -> start 위치부터 끝까지(인덱스)
	// substring(start, end) -> start 위치부터 end전까지

	public static void main(String[] args) {
		System.out.println(maskCC("1234-5678-9101-1121"));
	}

}
