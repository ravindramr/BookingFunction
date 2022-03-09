package com.entity;

import java.sql.Date;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



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

@Column(name = "show_date")
private Date show_date;

@Column(name = "start_time")
private String start_time;

@Column(name = "end_time")
private String end_time;

@Column(name = "seat")
private String seat;



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



public String getSeat() {
return seat;
}



public void setSeat(String seat) {
this.seat = seat;
}



public Booking(String movie_name, String language, Date show_date, String start_time, String end_time,
String seat) {
super();
this.movie_name = movie_name;
this.language = language;
this.show_date = show_date;
this.start_time = start_time;
this.end_time = end_time;
this.seat = seat;
}



public Booking() {
super();
}




}
