package com.movieneo4j.service;

import java.util.List;

import com.movieneo4j.entity.Booking;

public interface BookingService {

	void addBook(Booking b);

	List<Booking> showthat();

}
