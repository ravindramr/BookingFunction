package com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "seats")
public class Seats {

	@Id
	@Column(name = "seat_no")
	private int seat_no;

	@Column(name = "seat_status")
	private boolean seat_status;

//	public int getSeat_id() {
//		return seat_id;
//	}
//
//	public void setSeat_id(int seat_id) {
//		this.seat_id = seat_id;
//	}

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

	public Seats(int seat_no, boolean seat_status) {
		super();
		this.seat_no = seat_no;
		this.seat_status = seat_status;
	}

	public Seats() {
		super();
	}


	

}