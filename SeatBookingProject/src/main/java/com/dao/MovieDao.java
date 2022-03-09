package com.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.entity.Movie;


@Service
public interface MovieDao {
	public List <Movie> getShowMovie();
	//public ShowMovie getShowMovie(String name);
	//public ShowMovie getMovies();
	public List <Movie> getMovies(int id);
	//public List<ShowMovie> getMovies(String movie_name);
	public Movie getMovie(int id);
}
