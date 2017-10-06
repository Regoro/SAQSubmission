package com.thehit.domain;

import org.springframework.beans.factory.annotation.Required;

public class Ticket {
	int number;
	double price;
	
	
	
	
	public Ticket() {
		super();
		
	}




	public Ticket(int number, double price) {
		super();
		this.number = number;
		this.price = price;
		System.out.println(this);
	}




	public int getNumber() {
		return number;
	}



//	@Required
	public void setNumber(int number) {
		this.number = number;
	}




	public double getPrice() {
		return price;
	}




	public void setPrice(double price) {
		this.price = price;
	}




	@Override
	public String toString() {
		return "Ticket [number=" + number + ", price=" + price + "]";
	}
	
	
	
	

}
