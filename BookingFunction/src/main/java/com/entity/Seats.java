package com.entity;





import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="seats")
public class Seats{
	//@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="seat_no")
	private int seat_no;
	
	@Column(name="seat_status")
	private boolean seat_status;
	
//	@Column(name="language")
//	private String language;
//	
//	@Column(name="movie")
//	private String movie;
//	
//	@Column(name="date")
//	private String date;
//	
//	@Column(name="show_time")
//	private String show_time;

	

	public int getSeat_no() {
		return seat_no;
	}



	public void setSeat_no(int seat_no) {
		this.seat_no = seat_no;
	}



	public boolean isSeat_status() {
		return seat_status;
	}



	public void setSeat_status(boolean seat_status) {
		this.seat_status = seat_status;
	}



//	public String getLanguage() {
//		return language;
//	}
//
//
//
//	public void setLanguage(String language) {
//		this.language = language;
//	}
//
//
//
//	public String getMovie() {
//		return movie;
//	}
//
//
//
//	public void setMovie(String movie) {
//		this.movie = movie;
//	}
//
//
//
//	public String getDate() {
//		return date;
//	}
//
//
//
//	public void setDate(String date) {
//		this.date = date;
//	}
//
//
//
//	public String getShow_time() {
//		return show_time;
//	}
//
//
//
//	public void setShow_time(String show_time) {
//		this.show_time = show_time;
//	}
//


	public Seats(int seat_no, boolean seat_status) {
		super();
		this.seat_no = seat_no;
		this.seat_status = seat_status;
//		this.language = language;
//		this.movie = movie;
//		this.date = date;
//		this.show_time = show_time;
	}



	public Seats() {
		super();
	}
	
}
	