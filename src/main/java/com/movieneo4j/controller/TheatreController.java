package com.movieneo4j.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.movieneo4j.entity.Theatre;
import com.movieneo4j.service.TheatreService;



@RestController
public class TheatreController {
		
	@Autowired 
	TheatreService theatreservice;
	
	@GetMapping("/showtheatre")
	public List<Theatre> getAllTheatre(){
		 return theatreservice.getAllTheatre();
	}
	@GetMapping("/showtheatre/{screen}")
	public Theatre getbyScreen(@RequestParam("screen") int screen) {
		return theatreservice.getByScreen(screen);
	}
	@PostMapping("/addnewtheatre")
	public void addNew(@RequestBody Theatre t) {
		theatreservice.addNewTheatre(t);
	}
	@DeleteMapping("/removetheatre/{theatrename}")
	public void deleteTheatre(@PathVariable  String theatrename) {
		theatreservice.deleteTheatre(theatrename);
	}
	
}
