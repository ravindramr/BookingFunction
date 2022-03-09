package com.controller;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.dao.MovieDao;
import com.entity.Movie;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@Transactional
@Repository
@EnableWebMvc
@RequestMapping(value = "/movie", method = RequestMethod.GET)
public class MovieController {

	@Autowired
	private MovieDao movieDaoImpl;
	

	@RequestMapping(value = "/list")
	public String listMovies(Model m) {
		System.out.println(" inside Movie Controller inside List method");
		List<Movie> movies = movieDaoImpl.getShowMovie();
		for(Movie m1:movies) {
			System.out.println(m1.toString());
		}
		m.addAttribute("movieslist", movies);
		
		return "index";
	}
	
	@RequestMapping(value = "/book")
	public String BookMovies(@RequestParam("id") int id, Model Model) {
		System.out.println(" inside Movie Controller inside book method");
		System.out.println(id);
		Movie movies = movieDaoImpl.getMovie(id);
		Model.addAttribute("book", movies);
		return "bookingseating";
		
	}
}
