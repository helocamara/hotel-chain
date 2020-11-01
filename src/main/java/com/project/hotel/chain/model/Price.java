package com.project.hotel.chain.model;

public class Price {
	private Long wday_fidelity;
	private Long wday_regular;
	private Long wend_fidelity;
	private Long wend_regular;

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
