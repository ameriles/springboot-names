package com.sbnames.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;

@Entity
public class Name {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	@Column(name="value", nullable = false, length = 50)
	private String value;
	
	@Column(name = "createdAt", nullable = false, updatable = false)
	@CreationTimestamp
	private Timestamp createdAt;
		
	protected Name() {
	}
	
	public Name(long id, String value) {
		this.id = id;
		this.value = value;
	}
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public String getValue() {
		return value;
	}
	
	public void setValue(String value) {
		this.value = value;
	}
	
	public Timestamp getCreatedAt() {
		return createdAt;
	}
}
