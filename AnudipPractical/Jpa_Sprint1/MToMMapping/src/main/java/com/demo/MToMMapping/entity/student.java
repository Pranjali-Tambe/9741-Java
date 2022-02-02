package com.demo.MToMMapping.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import java.util.*;

@Entity
public class student {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int s_id;
	private String s_name;
	@ManyToMany(targetEntity=library.class)
	private List books_issued;
	
	public int getS_id() {
		return s_id;
	}
	public void setS_id(int s_id) {
		this.s_id = s_id;
	}
	public String getS_name() {
		return s_name;
	}
	public void setS_name(String s_name) {
		this.s_name = s_name;
	}

	public student(String s_name, List books_issued) {
		super();
		this.s_name = s_name;
		this.books_issued = books_issued;
	}

}
