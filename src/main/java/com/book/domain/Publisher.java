package com.book.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Publisher {
	
	@Id
	private String code;
	
	@Column(name = "PUBLISHER_NAME")
	private String name;

	public Publisher() {}	
	public Publisher(String code, String name) {
		this.code = code;
		this.name = name;
	}

	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Publisher [code=" + code + ", name=" 
				+ name + "]";
	}	
}














