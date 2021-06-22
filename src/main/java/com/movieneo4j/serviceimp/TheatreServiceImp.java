package com.movieneo4j.serviceimp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.movieneo4j.entity.Theatre;
import com.movieneo4j.repository.TheatreRepository;
import com.movieneo4j.service.TheatreService;
@Service
@Transactional
public class TheatreServiceImp implements TheatreService{
	
	@Autowired 
	TheatreRepository theatrerepo;

	@Override
	public List<Theatre> getAllTheatre() {
		return theatrerepo.findAll();
	}

	@Override
	public Theatre getByScreen(int screen) {
		return theatrerepo.findByScreen(screen);
	}

	@Override
	public void addNewTheatre(Theatre t) {
		theatrerepo.save(t);
//		Theatre t1=new Theatre();
//		t1.setMovie(t.getMovie());
//		t1.setScreen(t.getScreen());
//		t1.setTheatrename(t.getTheatrename());
//		
		
	}

	@Override
	public void deleteTheatre() {
		
		
	}

	@Override
	public void deleteTheatre(String theatrename) {
		theatrerepo.deleteByTheatrename(theatrename);
		
	}
	
}
