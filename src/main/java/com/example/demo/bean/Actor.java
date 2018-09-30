package com.example.demo.bean;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="actor",catalog="dvdrental")
public class Actor implements Serializable{

	
	private static final long serialVersionUID = 2845697715922637772L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="actor_id",unique=true,nullable=false)
	private Long actorId;
	
	@Column(name="first_name",nullable=false,length=45)
	private String firstName;
	
	@Column(name="last_name",nullable=false,length=45)
	private String lastName;
	
	@Column(name="last_update",nullable=false)
	private Timestamp lastUpdated;
	
	//Default Constructor
	public Actor() {
	
	}
	
	/* full constructor */
	
	public Actor(String firstName,String lastName,Timestamp lastUpdated) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.lastUpdated = lastUpdated;
	}

	/** Generate Getters and setters */
	
	public Long getActorId() {
		return actorId;
	}

	public void setActorId(Long actorId) {
		this.actorId = actorId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Timestamp getLastUpdated() {
		return lastUpdated;
	}

	public void setLastUpdated(Timestamp lastUpdated) {
		this.lastUpdated = lastUpdated;
	}
	
	
	
	
	
	
}
