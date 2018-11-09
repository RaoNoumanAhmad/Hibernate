package com.nouman.lab_07;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Person {
	@Id
	private int id;
	private String name;
	private String fathername;
	private String organization;
	private String mobile;
	
	public Person(int id, String name, String fname, String org, String mobile) {
		this.id = id;
		this.name = name;
		this.fathername = fname;
		this.organization = org;
		this.mobile = mobile;
	}
	
	public person() {}
	
	public int getPerson_id() {
		return person_id;
	}
	
	public String getName() {
		return name;
	}
	
	public String getFathername() {
		return fathername;
	}
	
	public String getOrganization() {
		return organization;
	}
	
	public String getMobile() {
		return mobile;
	}
	
	public void setPerson_id(int person_id) {
		this.person_id = person_id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setFathername(String fathername) {
		this.fathername = fathername;
	}
	
	public void setOrganization(String organization) {
		this.organization = organization;
	}
	
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
}