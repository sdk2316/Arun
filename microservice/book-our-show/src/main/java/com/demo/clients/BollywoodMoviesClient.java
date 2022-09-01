package com.demo.clients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.demo.models.Show;

//@FeignClient(value = "comic", url = "http://localhost:9090/api/v1/movies")
@FeignClient("BOLLYWOOD-MOVIES")
public interface BollywoodMoviesClient {

	@GetMapping("/api/v1/movies")
    	List<Show> getMovies();

	//    @GetMapping("/api/v1/movies/{movieId}")
	//    Show getMovieById(@PathVariable int movieId);
	
}