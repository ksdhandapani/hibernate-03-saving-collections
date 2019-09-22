package com.sakdd.models;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Address {

	@Column(name="street_name")
	private String streetName;
	@Column(name="city")
	private String city;
	@Column(name="state")
	private String state;
	@Column(name="country")
	private String country;
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Address(String streetName, String city, String state, String country) {
		super();
		this.streetName = streetName;
		this.city = city;
		this.state = state;
		this.country = country;
	}
	public Address() {
		super();
	}
	
}
