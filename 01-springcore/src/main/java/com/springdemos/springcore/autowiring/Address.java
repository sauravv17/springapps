package com.springdemos.springcore.autowiring;

public class Address {

	private int housenumber;
	private String Street;
	private String City;

	public int getHousenumber() {
		return housenumber;
	}

	public void setHousenumber(int housenumber) {
		this.housenumber = housenumber;
	}

	public String getStreet() {
		return Street;
	}

	public void setStreet(String street) {
		Street = street;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	@Override
	public String toString() {
		return "Address [housenumber=" + housenumber + ", Street=" + Street + ", City=" + City + "]";
	}

}
