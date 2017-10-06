package com.thehit.domain;

import org.springframework.beans.factory.annotation.Required;

public class Venue {

	String name;
	String addressLine1;
	String addressLine2;
	String country;
	int capacity;
	
	
	@Required
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getCapacity() {
		return capacity;
	}

	public Venue() {
		super();
	}




	public Venue(String name, String addressLine1, String addressLine2, String country, int capacity) {
		super();
		this.name = name;
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.country = country;
		this.capacity = capacity;
		System.out.println(this);
	}




	@Override
	public String toString() {
		return "Venue [name=" + name + ", addressLine1=" + addressLine1 + ", addressLine2=" + addressLine2
				+ ", country=" + country + ", capacity=" + capacity + "]";
	}
}
