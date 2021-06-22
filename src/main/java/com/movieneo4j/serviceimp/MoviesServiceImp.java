package com.movieneo4j.serviceimp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.movieneo4j.entity.Movies;
import com.movieneo4j.repository.MovieRepository;
import com.movieneo4j.service.MoviesService;
@Service
@Transactional
public class MoviesServiceImp implements MoviesService{
	
	@Autowired
	MovieRepository movierepo;
	
	@Override
	public void addmovie(Movies m) {
		movierepo.save(m);
	}

	@Override
	public List<Movies> getAllMovies() {
		
		return movierepo.findAll();
	}
	
	
}
