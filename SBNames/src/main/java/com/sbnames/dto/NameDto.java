package com.sbnames.dto;

import java.sql.Timestamp;

public class NameDto {
	private long id;
	private String value;
	private Timestamp createdAt;
	
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
	
	public void setCreatedAt(Timestamp value) {
		this.createdAt = value;
	}
}
