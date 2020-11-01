package com.project.hotel.chain.model;

import java.sql.Date;

public class Guest {

	private Long id;
	private String name;
	private String email;
	private Long password;
	private Long telehpone;
	private Date birthday;
	private Long profile;

	public Guest() {
		super();
	}

	public Guest(Long id, String name, String email, Long password, Long telehpone, Date birthday, Long profile) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
		this.telehpone = telehpone;
		this.birthday = birthday;
		this.profile = profile;
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

	public Long getPassword() {
		return password;
	}

	public void setPassword(Long password) {
		this.password = password;
	}

	public Long getTelehpone() {
		return telehpone;
	}

	public void setTelehpone(Long telehpone) {
		this.telehpone = telehpone;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public Long getProfile() {
		return profile;
	}

	public void setProfile(Long profile) {
		this.profile = profile;
	}

}
