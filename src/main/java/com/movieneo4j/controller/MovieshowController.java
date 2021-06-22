package com.movieneo4j.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.movieneo4j.entity.Showtime;
import com.movieneo4j.service.ShowtimeService;

@RestController
public class MovieshowController {
	
	@Autowired
	ShowtimeService showtimes;
	
	@GetMapping("/showtime")
	public List<Showtime> getShowTime(){
		return showtimes.getShowTimes();
	}
	
	@PostMapping("/addshowtime")
	public void addShowtime(@RequestBody Showtime s) {
		 showtimes.addShowtime(s);
	}
}
