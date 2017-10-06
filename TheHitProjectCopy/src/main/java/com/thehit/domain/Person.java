package com.thehit.domain;

public class Person {
	String firstname;
	String lastname;
	int age;

	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(String firstname, String lastname, int age) {
		
		this.firstname = firstname;
		this.lastname = lastname;
		this.age = age;
		System.out.println(this);
		
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
		System.out.println(age);
	}
	@Override
	public String toString() {
		return "Person [firstname=" + firstname + ", lastname=" + lastname + ", age=" + age + "]";
	}


	
}
