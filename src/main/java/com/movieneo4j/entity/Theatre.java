package com.movieneo4j.entity;


import java.util.Set;

import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;



@NodeEntity
public class Theatre {
	
	 @Id
	 @GeneratedValue
	 private Long id;
	 private String theatrename;
	 private int screen;
	 @Relationship(type="HAS_MOVIE",direction =Relationship.INCOMING)
	 private Set<Movies> movie;
	public Theatre() {
		super();
		
	}
	public Theatre(Long id, String theatrename, int screen, Set<Movies> movie) {
		super();
		this.id = id;
		this.theatrename = theatrename;
		this.screen = screen;
		this.movie = movie;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTheatrename() {
		return theatrename;
	}
	public void setTheatrename(String theatrename) {
		this.theatrename = theatrename;
	}
	public int getScreen() {
		return screen;
	}
	public void setScreen(int screen) {
		this.screen = screen;
	}
	public Set<Movies> getMovie() {
		return movie;
	}
	public void setMovie(Set<Movies> movie) {
		this.movie = movie;
	}
	@Override
	public String toString() {
		return "Theatre [id=" + id + ", theatrename=" + theatrename + ", screen=" + screen + ", movie=" + movie + "]";
	}
	
	 
	 

	 
}
