package com.edu;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Test03 {
	public static void main(String[] args) {
		
		String date = LocalDate.parse("2011-12-03T10:15:30+01:00[Europe/Paris]")
				.format(DateTimeFormatter.ISO_DATE_TIME);
		//'2011-12-03T10:15:30'
		//'2011-12-03T10:15:30',
		//'2011-12-03T10:15:30+01:00' or 
		//'2011-12-03T10:15:30+01:00[Europe/Paris]'.
		System.out.println(date);
	}
}
