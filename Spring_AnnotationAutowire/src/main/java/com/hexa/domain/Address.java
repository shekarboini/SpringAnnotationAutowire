package com.hexa.domain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
//progs
@Component
public class Address {
	//@Value("216")
	private int streetNo;
	@Value("BabyNagar")
	private String area;
	@Value("Chennai")
	private String city;
	@Value("TamilNadu")
	private String state;
	@Value("India")
	private String country;
	/*
	public void setStreetNo(int streetNo) {
		this.streetNo = streetNo;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setState(String state) {
		this.state = state;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	@Override
	public String toString() {
		return "streetNo--"+streetNo+"   area---"+area+"   city---"+city+"   state---"+state+"country---"+country;
	}
	
	public Address() {
		System.out.println("Address:0-param constructor");
	}
*/
	
	public void message() {
		System.out.println("Address: message()");
		System.out.println("streetNo----"+streetNo);
		System.out.println("Area---"+area);
		System.out.println("city---"+city);
		System.out.println("State---"+state);
		System.out.println("country---"+country);
	}
}
