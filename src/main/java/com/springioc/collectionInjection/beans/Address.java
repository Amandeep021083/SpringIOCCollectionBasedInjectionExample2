package com.springioc.collectionInjection.beans;

public class Address {
	private String houseNumber;
	private String city;

	public String getHouseNumber() {
		return houseNumber;
	}

	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Address [houseNumber=" + houseNumber + ", city=" + city + "]";
	}

}
