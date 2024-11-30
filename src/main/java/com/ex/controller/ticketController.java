package com.ex.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ex.binding.Passengerinfo;
import com.ex.binding.Ticketinfo;

@RestController
public class ticketController {
	@PostMapping(value = "/ticket", produces = { "application/json" }, consumes = { "application/json" })
	public ResponseEntity<Ticketinfo> bookticket(@RequestBody Passengerinfo request) {
		System.out.println(request);

		Ticketinfo info = new Ticketinfo();
		info.setTicketId(123);
		info.setPnr("jj1232");
		info.setTicketstatus("confirmed");

		return new ResponseEntity<Ticketinfo>(info, HttpStatus.CREATED);
	}

}
