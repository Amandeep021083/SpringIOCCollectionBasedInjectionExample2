package com.springioc.collectionInjection.beans;

import java.util.List;

public class User {

	private List<Car> cars;

	public List<Car> getCars() {
		return cars;
	}

	public void setCars(List<Car> cars) {
		this.cars = cars;
	}
	
}
