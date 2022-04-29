package com.springdemos.springcore.constructorinjection;

public class Address {

	private int housenumber;
	private String Street;
	private String City;

	public Address(int hnum, String street, String city) {
		this.housenumber = housenumber;
		this.Street = street;
		this.City = city;
	}

	@Override
	public String toString() {
		return "Address [housenumber=" + housenumber + ", Street=" + Street + ", City=" + City + "]";
	}

}
