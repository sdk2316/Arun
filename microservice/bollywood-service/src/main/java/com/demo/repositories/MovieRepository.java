package com.demo.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.demo.entities.Movie;

public interface MovieRepository extends MongoRepository<Movie, String> {}
