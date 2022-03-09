package com.dao;



import java.util.List;



import com.entity.Movie;
import com.entity.Seats;



public interface SeatsDao {



public boolean insert(Seats seat);



public List<Seats> getAllSeats();



// public boolean update(Seats seat);



public Seats getSeat_No(int seat_no);

public List<Movie> getMovie();
}
//package com.dao;
//import java.util.List;
//import com.entity.Seats;
//public interface SeatsDao {
//public List<Seats> getAllSeats();
//public Seats getSeat_No(int seat_no);
//public Seats getInsert(int seat_no, boolean seat_status);
//}