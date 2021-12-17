package com.edu50;

public class Test50 {
	public static void main(String[] args) {
		String str1 = "Java";
		String str2 = new String("java");
		// line n1
		if(str1.equalsIgnoreCase(str2)) {
			System.out.println("Equal");
		} else {
			System.out.println("Not Equal");
		}
		
		// Equal이 출력되게 하려면?
		/*
		 * String str3 = str2;
		 * if (str1 == str3)
		 * ->문자열 비교는 equals()
		 * 
		 * if(str1.equalsIgnoreCase(str2))
		 * -> 대소문자 구분없이 같은 글자인지 확인
		 * 
		 * String str3 = str2;
		 * if (str1.equals(str3))
		 * -> 첫 글자 j의 대소문자가 다름
		 * 
		 * if(str1.toLowerCase() == str2.toLowerCase())
		 * -> 소문자로 변환은 되지만 문자열비교가 아니라서 false
		 * 
		 */
	}
}
