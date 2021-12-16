package com.edu30;

public class Test10 {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder(5);
		String s = "";

		if(sb.equals(s)) {
			System.out.println("Match 1");
		} else if(sb.toString().equals(s.toString())) {
			System.out.println("Match 2");
		} else {
			System.out.println("No Match");
		}
		
/*
 * StringBuilder(): 
 * 새로운 StringBuilder 인스턴스 초기화
 * StringBuilder(int): 
 * 새로운 StringBuider 인스턴스를 지정된 용량(Capacity)을 사용해서 초기화
 * StringBuilder(string): 
 * 새로운 StringBuilder 인스턴스를 지정해준 문자열을 사용해서 초기화
 * StringBuilder(string, int): 
 * 새로운 StringBuilder 인스턴스를 지정해준 문자열과 용량을 사용해서 초기화
... 최대 용량도 지정해줄 수 있다. 나머진 공식문서를 참고하자.
 * 
 */
	}
}
