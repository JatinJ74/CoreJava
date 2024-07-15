package com.gvacharya.datetimeapi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class DateTimeApiDemo {

	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		System.out.println(today);
		
		//EPOCH a enum 
		LocalDate epochHistory = LocalDate.EPOCH.plus(10000, ChronoUnit.DAYS);
		System.out.println(epochHistory);
		
		LocalDate tommorrow = LocalDate.of(2024,06,23);
		System.out.println(tommorrow);
		
		LocalDate forMattedDate = LocalDate.parse("24.06.2024", DateTimeFormatter.ofPattern("dd.MM.yyyy"));
		System.out.println(forMattedDate);
		
		LocalDate zonedDate = LocalDate.now(ZoneId.of("Africa/Harare"));
		System.out.println(zonedDate);
		
		LocalDate bDay = LocalDate.parse("10.01.2002",DateTimeFormatter.ofPattern("dd.MM.yyyy"));
		System.out.println(bDay.getDayOfMonth());
		System.out.println(bDay.getDayOfWeek());
		
		bDay = bDay.plusMonths(2);
		System.out.println(bDay.getDayOfWeek());
		
		LocalTime timenow = LocalTime.now();
		System.out.println(timenow);
		
		LocalTime timeNow1 = LocalTime.parse("01:30:42");
		System.out.println(timeNow1.minus(5,ChronoUnit.HOURS));
		
		LocalTime localTime = LocalTime.of(02, 30);
		boolean isAfter = localTime.isAfter(LocalTime.parse("22:00"));
		boolean isBefore = localTime.isBefore(LocalTime.parse("22:00"));
		
		System.out.println(isAfter);
		System.out.println(isBefore);
		
		LocalDateTime timeStamp = LocalDateTime.now();
		System.out.println(timeStamp);
		
		Period p = Period.between(LocalDate.now(), bDay);
		System.out.println(p);
		
		System.out.println("Days" + p.getDays());
		
		
		Date newDate = null;
		
//		try {
//			newDate = simpleDate.parse("01.01.2001");
//			
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
		
		
		
	}
}
