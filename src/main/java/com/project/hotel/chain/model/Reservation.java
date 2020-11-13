package com.project.hotel.chain.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table (name = "reservation")
public class Reservation {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column (nullable = false, columnDefinition = "Date")
	private Date checkin;
	
	@Column (nullable = false, columnDefinition = "Date")
	private Date checkout;
	
	@Column (nullable = false)
	private Long value;

	@ManyToOne(fetch = FetchType.EAGER, optional = false)
	private Hotel hotel;
	
	@ManyToOne(fetch = FetchType.EAGER, optional = false)
	private Guest guest;

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
