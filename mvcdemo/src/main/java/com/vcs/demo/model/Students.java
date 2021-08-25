package com.vcs.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Students {
	
	
	Integer rollnumber;
	@Id
	String name;
	/**
	 * @return the rollNumber
	 */
	public Integer getRollNumber() {
		return rollnumber;
	}
	/**
	 * @param rollNumber the rollNumber to set
	 */
	public void setRollNumber(Integer rollNumber) {
		this.rollnumber = rollNumber;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	public Students(Integer rollNumber, String name) {
	
		this.rollnumber = rollNumber;
		this.name = name;
	}
	public Students() {
		
	}

	

}
