package com.controller;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.app.SeatsDaoImpl;
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
	    	System.out.println("In list customers method");
	        List < Seats > seat = dao.getAllSeats();
	        theModel.addAttribute("seats", seat);
	        return "bookingseats";
	    }
	  @GetMapping(value = "/updateseat")  
public String updateSeats(@RequestParam("seat_no") int seat_no, Model Model)
{
	 Seats seat = dao.getUpdate(seat_no);
	 seat.setSeat_status(true);
     Model.addAttribute("update", seat);
     return "bookingseats";
	//return null;
	
}
}
