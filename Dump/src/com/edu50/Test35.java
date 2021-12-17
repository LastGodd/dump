package com.edu50;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Test35 {
	public static void main(String[] args) {
		LocalDate date1 = LocalDate.now();
		LocalDate date2 = LocalDate.of(2014, 6, 20);
		LocalDate date3 = LocalDate.parse("2014-06-20", DateTimeFormatter.ISO_DATE);

		System.out.println("date1 = " + date1);
		System.out.println("date2 = " + date2);
		System.out.println("date3 = " + date3);

		// Assume that the system date is
		// June 20, 2014. What is the result?
		// 시스템 날짜가 2014년 6월 20일이라고 가정함 결과는?

		/*
		 * date1 = 2014-06-20 
		 * date2 = 2014-06-20 
		 * date3 = 2014-06-20
		 * 
		 */
	}
}
