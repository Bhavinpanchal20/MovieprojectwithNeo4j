package com.movieneo4j.serviceimp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.movieneo4j.entity.Showtime;
import com.movieneo4j.repository.ShowtimeRepository;
import com.movieneo4j.service.ShowtimeService;
@Service
@Transactional
public class ShowtimeServiceImp implements ShowtimeService{
	
	@Autowired
	ShowtimeRepository showtimeRepo;
	@Override
	public List<Showtime> getShowTimes() {
		return showtimeRepo.findAll();
	}

	@Override
	public void addShowtime(Showtime s) {
		 showtimeRepo.save(s);
	}

}
