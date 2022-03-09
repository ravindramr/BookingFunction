package com.controller;
import java.util.List;



import javax.transaction.Transactional;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;



import com.dao.SeatsDaoImpl;
import com.entity.Booking;
import com.entity.Movie;
import com.entity.Seats;



@Controller
@Transactional
@Repository
@EnableWebMvc
@RequestMapping("/booking")
public class BookingController {
@Autowired
private SeatsDaoImpl dao;



@GetMapping(value = "/listseat")
public String SeatBooking(Model theModel) {
System.out.println("In SeatBooking method ");
List<Seats> seat = dao.getAllSeats();
List<Movie> getmovie= dao.getMovie();
theModel.addAttribute("movies", getmovie);
theModel.addAttribute("seats", seat);
return "bookingseats";
}

@GetMapping(value = "/submit")
public String insertSeats(@RequestParam("seat_no") int seat_no, boolean seat_status, Model Model) {
System.out.println("inside insert seat method");
Seats seat = dao.getInsert(seat_no, seat_status);
System.out.println("seat we want: "+seat_no);
//seat.setSeat_status(true);
System.out.println("seat status: "+seat_status);
Model.addAttribute("insert", seat);
return "bookingseats";
}

@GetMapping(value = "/listtickets")
public String TicketBooking(Model theModel, Movie movie) {
System.out.println("ticketBooking for arisha ");
List<Booking> ticket = dao.getAlltickets();
theModel.addAttribute("tickets", ticket);
theModel.addAttribute("movies",movie);
return "bookingseats";
}


}
//
//import java.util.List;
//
//import javax.transaction.Transactional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.stereotype.Repository;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.servlet.config.annotation.EnableWebMvc;
//
//import com.dao.SeatsDaoImpl;
//import com.entity.Seats;

//@Controller
//@Transactional
//@Repository
//@EnableWebMvc
//@RequestMapping("/booking")
//public class BookingController {
//	@Autowired
//	private SeatsDaoImpl dao;
//
//	@GetMapping(value = "/listseat")
//	public String SeatBooking(Model theModel) {
//		System.out.println("In list customers method");
//		List<Seats> seat = dao.getAllSeats();
//		theModel.addAttribute("seats", seat);
//		return "bookingseats";
//	}
//
//	@GetMapping(value = "/submit")
//	public String insertSeats(@RequestParam("seat_no") int seat_no, boolean seat_status, Model Model) {
//		System.out.println("inside insert seat method");
//		Seats seat = dao.getInsert(seat_no, seat_status);
//		Model.addAttribute("insert", seat);
//		return "bookingseats";
//	}	
//}