package com.project.hotel.chain.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table (name = "hotel")
public class Hotel {

	@Override
	public String toString() {
		return "Hotel [id=" + id + ", name=" + name + ", email=" + email + ", telephone=" + telephone
				+ ", classification=" + classification + "]";
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column (nullable = false)
	private String name;
	
	@Column (nullable = false)
	private String email;
	
	@Column (nullable = false)
	private Long telephone;
	
	@Column (nullable = false)
	private Long classification;
	
	@OneToOne(fetch = FetchType.EAGER, optional = false)
	private Price price;
	
	@OneToMany(mappedBy = "hotel", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Reservation> reservation;

	public Hotel() {
		super();
	}

	public Hotel(Long id, String name, String email, Long telephone, Long classification) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.telephone = telephone;
		this.classification = classification;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getTelephone() {
		return telephone;
	}

	public void setTelephone(Long telephone) {
		this.telephone = telephone;
	}

	public Long getClassification() {
		return classification;
	}

	public void setClassification(Long classification) {
		this.classification = classification;
	}

}
