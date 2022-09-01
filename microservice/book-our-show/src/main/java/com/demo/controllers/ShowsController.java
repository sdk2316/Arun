package com.demo.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.clients.BollywoodMoviesClient;
import com.demo.models.Show;

@RestController
@RequestMapping("/shows/api/v1")
public class ShowsController {
	
	@Autowired
	private BollywoodMoviesClient client;
	
	@GetMapping
	public List<Show> getDefaultShows(){		
		List<Show> shows = new ArrayList<Show>();
		shows.add(new Show("Mahabharat", "Ram", 4.9));
		shows.add(new Show("Ramayan", "Valmiki", 4.7));
		shows.add(new Show("Rani Laxmibai", "Albert", 4.9));
		
		return shows;
	}
	
//	http://192.168.1.44:33169/shows/api/v1
//	http://192.168.1.44:33467/shows/api/v1

	@GetMapping("/bollywood")
	public List<Show> getAllBollywoodMovies(){
		
		return client.getMovies();
	}
	
}