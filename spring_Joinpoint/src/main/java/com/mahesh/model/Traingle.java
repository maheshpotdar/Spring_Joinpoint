package com.mahesh.model;

public class Traingle {

	private String name;

	public Traingle() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;

	}

	public String setInfo(String name) {
		return name;
	}

	@Override
	public String toString() {
		return "Traingle [name=" + name + "]";
	}

	public void disp() {
		System.out.println("Setter run: " + getName());
	}

}
