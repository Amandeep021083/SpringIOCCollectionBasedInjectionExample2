package com.springioc.collectionInjection.beans;

public class Car {
	
	private String name;
	private String cost;
	private String model;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCost() {
		return cost;
	}
	public void setCost(String cost) {
		this.cost = cost;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	@Override
	public String toString() {
		return "Car [name=" + name + ", cost=" + cost + ", model=" + model
				+ "]";
	}
	
	
}
