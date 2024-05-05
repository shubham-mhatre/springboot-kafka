package com.sm.sv.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sm.sv.service.TicketBookingService;

@RestController
public class TicketBookingController {
	
	@Autowired private TicketBookingService service;

	@GetMapping("/bookticket")
	public ResponseEntity<Map<String, String>> bookticket() {
		service.bookTicket(10);
		return new ResponseEntity<>(Map.of("message","ticket booked successfully"),HttpStatus.OK);
	}
}
