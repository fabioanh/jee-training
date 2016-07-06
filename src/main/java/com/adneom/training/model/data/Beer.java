package com.adneom.training.model.data;

public class Beer {
	private String name;
	private String brewery;

	public Beer(String name, String brewery) {
		this.name = name;
		this.brewery = brewery;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrewery() {
		return brewery;
	}

	public void setBrewery(String brewery) {
		this.brewery = brewery;
	}

}
