package com.thehit.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.thehit.interfaces.Audience;

public class AudienceImpl extends Person {
	
	Ticket ticket;
	



	public AudienceImpl() {
		super();
	}
	
	public AudienceImpl(Person person) {
		super(person.firstname, person.lastname,person.age);
		System.out.println(this);
	}
	
	
	public AudienceImpl(String firstname, String lastname, int age, Ticket ticket) {
		super(firstname, lastname,age);
		this.ticket = ticket;
		System.out.println(this);
		
	}




	
	public Ticket getTicket() {
		return ticket;
	}
	
//	@Autowired
//	@Qualifier("ticket")
	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
		System.out.println("ticket set. Number = " + this.ticket.number + " Price = " + this.ticket.price);
	}
	
	void Purchase(Ticket x) {
		
		this.ticket = x;
		
	}
	void Refund() {
		this.ticket = null;
	}




	@Override
	public String toString() {
		return "AudienceImpl [firstname=" + firstname + ", lastname=" + lastname + ", age=" + age
				+ " ticket=" + ticket + "]";
	}

}
