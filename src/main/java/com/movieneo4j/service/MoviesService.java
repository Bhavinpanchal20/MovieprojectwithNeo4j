package com.movieneo4j.service;

import java.util.List;

import com.movieneo4j.entity.Movies;



public interface MoviesService {

	void addmovie(Movies m);

	List<Movies> getAllMovies();
}
