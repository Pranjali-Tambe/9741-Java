package com.demo.MToMMapping.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import java.util.*;

@Entity

public class library {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int b_id;
	private String b_name;
	
	@ManyToMany(targetEntity=student.class)
	private List books_issued;
	
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
	public library() {}
	public library( String b_name, List books_issued) {
		super();
	
		this.b_name = b_name;
		this.books_issued = books_issued;
	}
	
	}
	


