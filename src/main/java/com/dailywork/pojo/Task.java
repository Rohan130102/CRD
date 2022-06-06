package com.dailywork.pojo;

import java.util.Date;

public class Task {

	private int id;
	private String name;
	private String description;
	private Date createdOn;
	private User user;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Task(String name, String description, Date createdOn, User user) {
		this.name = name;
		this.description = description;
		this.createdOn = createdOn;
		this.user = user;
	}

	public Task() {}

}
