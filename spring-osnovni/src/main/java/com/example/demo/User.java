package com.example.demo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "user")
public class User {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
	@Column(name = "name")
    private String name;	//ovdje je stajalo	private final String name;	provjeriti zasto
	@Column(name = "email")
    private String email;	//ovdje je stajalo	private final String email;	provjeriti zasto
    
    public User() {
    	
    }
    public User(String name, String email) {
		//this.id = id;
		this.name = name;
		this.email = email;
	}
    
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}

	@Override
	public String toString() {
		return "User ["
				+ "id=" + id + 
				", name=" + name + 
				", email=" + email + 
				"]";
	}
}
