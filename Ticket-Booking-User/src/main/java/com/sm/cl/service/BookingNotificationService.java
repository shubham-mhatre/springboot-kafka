package com.sm.cl.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class BookingNotificationService {
	
	@KafkaListener(topics = "book-ticket",groupId = "user-group")
	public void bookingNotification(String notification) {
		System.out.println("notification : booked ticket : "+notification);
	}
}
