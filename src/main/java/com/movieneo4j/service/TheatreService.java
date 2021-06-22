package com.movieneo4j.service;

import java.util.List;

import com.movieneo4j.entity.Theatre;



public interface TheatreService {
	
	
	List<Theatre> getAllTheatre();

	Theatre getByScreen(int screen);

	void addNewTheatre(Theatre t);

	void deleteTheatre();

	void deleteTheatre(String theatrename);
}
