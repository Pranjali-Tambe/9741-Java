package com.demo.OneToOneMapping.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class library {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO) 
	 private int b_id;
	private String b_name;
	@OneToOne
	private student stud;
	public int getB_id() {
		return b_id;
	}
	public void setB_id(int b_id) {
		this.b_id = b_id;
	}
	public String getB_name() {
		return b_name;
	}
	public void setB_name(String b_name) {
		this.b_name = b_name;
	}
	public student getStud() {
		return stud;
	}
	public void setStud(student stud) {
		this.stud = stud;
	}
	
	

}
