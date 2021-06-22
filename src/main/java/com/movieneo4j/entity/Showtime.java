package com.movieneo4j.entity;

import java.time.LocalDate;

import org.neo4j.ogm.annotation.NodeEntity;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;

@NodeEntity
public class Showtime {
	
		@Id
		@GeneratedValue
		private Long id;
		private String moviename;
		private String theatrename;
		private float duration;
		private int screen;
		private LocalDate showdatemovie;
		private float showtimemovie;
		public Showtime() {
			super();
			
		}
		public Showtime(Long id, String moviename, String theatrename, float duration, int screen,
				LocalDate showdatemovie, float showtimemovie) {
			super();
			this.id = id;
			this.moviename = moviename;
			this.theatrename = theatrename;
			this.duration = duration;
			this.screen = screen;
			this.showdatemovie = showdatemovie;
			this.showtimemovie = showtimemovie;
		}
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getMoviename() {
			return moviename;
		}
		public void setMoviename(String moviename) {
			this.moviename = moviename;
		}
		public String getTheatrename() {
			return theatrename;
		}
		public void setTheatrename(String theatrename) {
			this.theatrename = theatrename;
		}
		public float getDuration() {
			return duration;
		}
		public void setDuration(float duration) {
			this.duration = duration;
		}
		public int getScreen() {
			return screen;
		}
		public void setScreen(int screen) {
			this.screen = screen;
		}
		public LocalDate getShowdatemovie() {
			return showdatemovie;
		}
		public void setShowdatemovie(LocalDate showdatemovie) {
			this.showdatemovie = showdatemovie;
		}
		public float getShowtimemovie() {
			return showtimemovie;
		}
		public void setShowtimemovie(float showtimemovie) {
			this.showtimemovie = showtimemovie;
		}
		@Override
		public String toString() {
			return "Showtime [id=" + id + ", moviename=" + moviename + ", theatrename=" + theatrename + ", duration="
					+ duration + ", screen=" + screen + ", showdatemovie=" + showdatemovie + ", showtimemovie="
					+ showtimemovie + "]";
		}
		
		
		
		
}
