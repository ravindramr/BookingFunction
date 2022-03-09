package com.dao;

import java.util.List;
import com.entity.Movie;
import com.entity.Seats;

public interface SeatsDao {
	//public boolean insert(Seats seat);

	public List<Seats> getAllSeats();// public boolean update(Seats seat); public Seats getSeat_No(int seat_no);

	//public List<Movie> getMovie();
}
