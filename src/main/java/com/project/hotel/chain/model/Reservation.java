package com.project.hotel.chain.model;

import java.sql.Date;

public class Reservation {

	private Long id;
	private Date checkin;
	private Date checkout;
	private Long value;

	public Reservation() {
		super();
	}

	public Reservation(Long id, Date checkin, Date checkout, Long value) {
		super();
		this.id = id;
		this.checkin = checkin;
		this.checkout = checkout;
		this.value = value;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getCheckin() {
		return checkin;
	}

	public void setCheckin(Date checkin) {
		this.checkin = checkin;
	}

	public Date getCheckout() {
		return checkout;
	}

	public void setCheckout(Date checkout) {
		this.checkout = checkout;
	}

	public Long getValue() {
		return value;
	}

	public void setValue(Long value) {
		this.value = value;
	}

}
