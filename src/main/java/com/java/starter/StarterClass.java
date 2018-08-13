package com.java.starter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
class StarterClass {

	@Id
	@GeneratedValue
	private Long id;
	private String name;
	
	public StarterClass() {
		
	}
	public StarterClass(String name) {
		this.name = name;
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
	
	@Override
	public String toString() {
		return "StarterClass [id=" + id + ", name=" + name + "]";
	}
}
