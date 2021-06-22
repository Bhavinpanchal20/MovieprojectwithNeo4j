package com.movieneo4j.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.movieneo4j.entity.Movies;
import com.movieneo4j.service.MoviesService;

@RestController
public class MovieController {
	
	@Autowired
	MoviesService movieservice;
	
	@GetMapping("/showmovies")
	public List<Movies> getAllMovie(){
		 return movieservice.getAllMovies();
	}
	
	@PostMapping("/insertmovies")
	public void addMovies(@RequestBody Movies m) {
		 movieservice.addmovie(m);
	}
	
}
