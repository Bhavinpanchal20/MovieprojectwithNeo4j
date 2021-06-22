package com.movieneo4j.serviceimp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.movieneo4j.entity.Booking;
import com.movieneo4j.repository.BookingRepository;
import com.movieneo4j.service.BookingService;
@Service
@Transactional
public class BookingServiceImp implements BookingService{
	
	@Autowired
	BookingRepository bookrepo;

	@Override
	public void addBook(Booking b) {
		bookrepo.save(b);
	}

	@Override
	public List<Booking> showthat() {
		
		return bookrepo.findAll();
	}
	
}
