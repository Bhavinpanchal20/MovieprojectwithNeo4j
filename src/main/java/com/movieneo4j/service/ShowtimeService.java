package com.movieneo4j.service;

import java.util.List;

import com.movieneo4j.entity.Showtime;



public interface ShowtimeService {
	
	List<Showtime> getShowTimes();

//	Showtime addShowtime();

	void addShowtime(Showtime s);
}
