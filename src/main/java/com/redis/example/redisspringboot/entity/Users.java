package com.redis.example.redisspringboot.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;



@Entity
public class Users implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	String userId;
	private String name;
	private long followers;
	
	public Users() {
		
	}
	
	public Users(String userId, String name, long followers) {
		this.userId = userId;
		this.name = name;
		this.followers = followers;
	}
	
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getFollowers() {
		return followers;
	}
	public void setFollowers(long followers) {
		this.followers = followers;
	}
	
	

}
