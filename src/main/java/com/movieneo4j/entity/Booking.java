package com.movieneo4j.entity;

import java.util.List;

import org.neo4j.ogm.annotation.NodeEntity;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;

@NodeEntity
public class Booking {
	@Id
	@GeneratedValue
	private Long id;
	private String username;
	private String phoneno;
	private String theatrename;
	private int screen;
	private String moviename;
	private float showtime;
	private List<String> seatid;
	private float price;
	public Booking() {
		super();
		
	}
	public Booking(Long id, String username, String phoneno, String theatrename, int screen, String moviename,
			float showtime, List<String> seatid, float price) {
		super();
		this.id = id;
		this.username = username;
		this.phoneno = phoneno;
		this.theatrename = theatrename;
		this.screen = screen;
		this.moviename = moviename;
		this.showtime = showtime;
		this.seatid = seatid;
		this.price = price;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
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
	public String getMoviename() {
		return moviename;
	}
	public void setMoviename(String moviename) {
		this.moviename = moviename;
	}
	public float getShowtime() {
		return showtime;
	}
	public void setShowtime(float showtime) {
		this.showtime = showtime;
	}
	public List<String> getSeatid() {
		return seatid;
	}
	public void setSeatid(List<String> seatid) {
		this.seatid = seatid;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Booking [id=" + id + ", username=" + username + ", phoneno=" + phoneno + ", theatrename=" + theatrename
				+ ", screen=" + screen + ", moviename=" + moviename + ", showtime=" + showtime + ", seatid=" + seatid
				+ ", price=" + price + "]";
	}
	
	
	
	
}
