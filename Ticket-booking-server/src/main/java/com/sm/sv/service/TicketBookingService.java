package com.sm.sv.service;

import java.security.SecureRandom;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class TicketBookingService {
	
	@Autowired private KafkaTemplate<String,Object> kafkaTemplate;
	
	private static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
    private static final SecureRandom random = new SecureRandom();

	public void bookTicket(Integer numberOfTickets) {		
		for (int i = 0; i < numberOfTickets; i++) {
            String randomString = generateTicketNumber();
            System.out.println("Booked ticket : ticket Number is : " + randomString);            
            try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
            Map<String,String> ticketNumberMap=new HashMap<>();
            ticketNumberMap.put("ticket_number", randomString);
            kafkaTemplate.send("book-ticket", ticketNumberMap.toString());
        }	
	}
	
	private String generateTicketNumber() {
		StringBuilder sb = new StringBuilder(8);
        for (int i = 0; i < 8; i++) {
            int randomIndex = random.nextInt(CHARACTERS.length());
            sb.append(CHARACTERS.charAt(randomIndex));
        }
        return sb.toString();
	}

}
