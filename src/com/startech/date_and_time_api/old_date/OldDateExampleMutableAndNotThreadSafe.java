package com.startech.date_and_time_api.old_date;

import java.time.LocalDateTime;
import java.util.Date;

public class OldDateExampleMutableAndNotThreadSafe {

	public static void main(String[] args) {
		Date date = new Date();
		LocalDateTime dateTime = LocalDateTime.now();

		// Simulate concurrent modification by two threads
		Thread t1 = new Thread(() -> {
			for (int i = 0; i < 1000; i++) {
				date.setTime(System.currentTimeMillis());
				LocalDateTime dateTime1 = LocalDateTime.now();
			}
		});

		Thread t2 = new Thread(() -> {
			for (int i = 0; i < 1000; i++) {
				date.setTime(System.currentTimeMillis());
				LocalDateTime dateTime1 = LocalDateTime.now();
			}
		});

		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(date);
		System.out.println(dateTime);
	}

}
