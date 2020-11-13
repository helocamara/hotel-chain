package com.project.hotel.chain.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table (name = "price")
public class Price {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column (nullable = false)
	private Long wday_fidelity;
	
	@Column (nullable = false)
	private Long wday_regular;
	
	@Column (nullable = false)
	private Long wend_fidelity;
	
	@Column (nullable = false)
	private Long wend_regular;
	
	@OneToOne(fetch = FetchType.EAGER, optional = false)
	private Hotel hotel;
	
	public Price() {
		super();
	}

	public Price(Long wday_fidelity, Long wday_regular, Long wend_fidelity, Long wend_regular) {
		super();
		this.wday_fidelity = wday_fidelity;
		this.wday_regular = wday_regular;
		this.wend_fidelity = wend_fidelity;
		this.wend_regular = wend_regular;
	}

	public Long getWday_fidelity() {
		return wday_fidelity;
	}

	public void setWday_fidelity(Long wday_fidelity) {
		this.wday_fidelity = wday_fidelity;
	}

	public Long getWday_regular() {
		return wday_regular;
	}

	public void setWday_regular(Long wday_regular) {
		this.wday_regular = wday_regular;
	}

	public Long getWend_fidelity() {
		return wend_fidelity;
	}

	public void setWend_fidelity(Long wend_fidelity) {
		this.wend_fidelity = wend_fidelity;
	}

	public Long getWend_regular() {
		return wend_regular;
	}

	public void setWend_regular(Long wend_regular) {
		this.wend_regular = wend_regular;
	}

}
