package com.hexa.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Employee {
	@Autowired
	private Person person;
	/*public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	public Employee() {
		System.out.println("Employee:0-param constructor");
	}
	@Override
	public String toString() {
		return "Person Details:---"+person.toString()+"Address---"+address.toString();
	}*/
	
	public void message() {
		System.out.println("Employee: message()");
		person.message();
	}
	
	
}
