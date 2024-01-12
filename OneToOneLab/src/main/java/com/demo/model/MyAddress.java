package com.demo.model;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Address02")
public class MyAddress {
	

    @Id
	private int addid;
	
	private String street;
	
	private String city;
	
	public MyAddress() {
		super();
	}
	
	

	public MyAddress(int addid, String street, String city) {
		super();
		this.addid = addid;
		this.street = street;
		this.city = city;
	}



	public int getAddid() {
		return addid;
	}



	public void setAddid(int addid) {
		this.addid = addid;
	}



	public String getStreet() {
		return street;
	}



	public void setStreet(String street) {
		this.street = street;
	}



	public String getCity() {
		return city;
	}



	public void setCity(String city) {
		this.city = city;
	}



	@Override
	public String toString() {
		return "MyAddress [addid=" + addid + ", street=" + street + ", city=" + city + "]";
	}
	
	
	
	
	
	
	
	
	
	

}
