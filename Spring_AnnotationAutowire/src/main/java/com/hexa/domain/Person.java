package com.hexa.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Person {
	
	
	private Address address;
	@Value("459")
	private int uid;
	@Value("Shekar")
	private String firstName;
	@Value("Boini")
	private String lastName;
	
	
	/*
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public Person() {
		System.out.println("Person:0-param constructor");
	}
	
	@Override
	public String toString() {
		
		return "Person--UID: "+uid+"FirstName: "+firstName+"LastName: "+lastName;
	}*/
	
	public Address getAddress() {
		return address;
	}

	@Autowired(required=false)
	//@Required
	public void setAddress(Address address) {
		this.address = address;
	}


	public void message() {
		System.out.println("Person: message()");
		System.out.println("UID---"+uid);
		System.out.println("FirstName---"+firstName);
		System.out.println("LastName---"+lastName);
		address.message();
	}

}
