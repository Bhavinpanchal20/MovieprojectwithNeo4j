package com.movieneo4j.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.movieneo4j.entity.Booking;
import com.movieneo4j.service.BookingService;

@RestController
public class Bookingticket {
	
	 @Autowired
	 BookingService bookservice;
	 @PostMapping("/bookthat")	
	 public void addNew(@RequestBody Booking b) {
		 bookservice.addBook(b);
	 }
	 
	 @GetMapping("/showallbooking")
	 public List<Booking> getAll(){
		 return bookservice.showthat();
	 }
	
}
