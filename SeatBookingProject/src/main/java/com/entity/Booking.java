package com.entity;



import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;



@Entity
@Table(name = "booking")
public class Booking {
@Id
@Column(name = "booking_id")
private int booking_id;
@Column(name = "movie_name")
private String movie_name;

@Column(name = "language")
private String language;
@DateTimeFormat(pattern = "dd/MM/yyyy")
//@Temporal(TemporalType.DATE) // USED TO REMOVE THE TIME FRAME THAT PLACING BESIDE DATE WHEN PRINTING THE DATE.
@Column(name = "show_date")
private Date show_date;

@Column(name = "start_time")
private String start_time;

@Column(name = "end_time")
private String end_time;

@Column(name = "seat_no")
private int seat_no;





public int getBooking_id() {
	return booking_id;
}





public void setBooking_id(int booking_id) {
	this.booking_id = booking_id;
}





public String getMovie_name() {
	return movie_name;
}





public void setMovie_name(String movie_name) {
	this.movie_name = movie_name;
}





public String getLanguage() {
	return language;
}





public void setLanguage(String language) {
	this.language = language;
}





public Date getShow_date() {
	return show_date;
}





public void setShow_date(Date show_date) {
	this.show_date = show_date;
}





public String getStart_time() {
	return start_time;
}





public void setStart_time(String start_time) {
	this.start_time = start_time;
}





public String getEnd_time() {
	return end_time;
}





public void setEnd_time(String end_time) {
	this.end_time = end_time;
}





public int getSeat_no() {
	return seat_no;
}





public void setSeat_no(int seat_no) {
	this.seat_no = seat_no;
}





public Booking(int booking_id, String movie_name, String language, Date show_date, String start_time, String end_time,
		int seat_no) {
	super();
	this.booking_id = booking_id;
	this.movie_name = movie_name;
	this.language = language;
	this.show_date = show_date;
	this.start_time = start_time;
	this.end_time = end_time;
	this.seat_no = seat_no;
}





public Booking() {

}




}