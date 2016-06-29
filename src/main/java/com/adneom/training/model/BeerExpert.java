package com.adneom.training.model;

import java.util.ArrayList;
import java.util.List;

public class BeerExpert {
	public List<String> getBrands(String color) {
		List<String> brands = new ArrayList<String>();
		if (color.equals("amber") || color.equals("red")) {
			brands.add("Jack Amber");
			brands.add("Red Moose");
		} else if(color.equals("light") || color.equals("dark")){
			brands.add("Jail Pale Ale");
			brands.add("Gout Stout");
		}
		return (brands);
	}
}
