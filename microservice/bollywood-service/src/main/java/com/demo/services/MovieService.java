package com.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.entities.Movie;
import com.demo.repositories.MovieRepository;

@Service
public class MovieService {

	@Autowired
	private MovieRepository repo;
	
	public Movie saveMovie(Movie m) {
		return repo.save(m);
	}

	public List<Movie> fetchMovies() {
		return repo.findAll();
	}
	
}
