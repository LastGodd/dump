package com.edu60;

import java.util.ArrayList;

public class Test45 {
	public static void main(String[] args) {
		ArrayList myList = new ArrayList();
		String[] myArray;

		try {
			while (true) {
				myList.add("My String");
			}
		} catch (RuntimeException re) {
			System.out.println("Caught a RuntimeException");
		} catch (Exception e) {
			System.out.println("Caught an Exception");
		}
		System.out.println("Ready to use");
	}
	
	/*
	 * Answer is C!!
	 * 
	 * A. Execution terminates in the first catch statement, and caught a
	 * RuntimeException is printed to the console. -> 실행이 첫 번째 캐치문에서 종료되고 런타임에
	 * 걸렸습니다. 예외는 콘솔에 인쇄됩니다
	 * 
	 * B. Execution terminates in the second catch statement, and caught an
	 * Exception is printed to the console. -> 두 번째 캐치문에서 실행이 종료되고 캐치된 예외가 콘솔에 인쇄됩니다
	 * 
	 * C. A runtime error is thrown in the thread "main". -> 런타임 오류는 "메인" 스레드에 발생합니다
	 * 
	 * D.Execution completes normally, and Ready to use is printed to the console.
	 * -> 실행이 정상적으로 완료되고 사용 준비가 콘솔에 인쇄됩니다.
	 * 
	 * E. The code fails to compile because a throws keyword is required. -> throws
	 * 키워드가 필요하기 때문에 코드가 컴파일되지 않습니다
	 * 
	 */
}
