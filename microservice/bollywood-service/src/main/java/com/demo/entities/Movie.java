package com.demo.entities;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Movie {
	@Id
	private String id;
	private String title;
	private String director;
	private double rating;
	private String releaseDate;
	
	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}
	public String getReleaseDate() {
		return releaseDate;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	
	@Override
	public String toString() {
		return "Movie [id=" + id + ", title=" + title + ", director=" + director + ", rating=" + rating
				+ ", releaseDate=" + releaseDate + "]";
	}
	
	
	
	public Movie(String title, String director, double rating, String releaseDate) {
		super();
		this.title = title;
		this.director = director;
		this.rating = rating;
		this.releaseDate = releaseDate;
	}
	
	public Movie(String id, String title, String director, double rating, String releaseDate) {
		this(title, director, rating, releaseDate);
		this.id = id;
	}
	
	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}
}
