package com.adneom.training.model;

import java.util.ArrayList;
import java.util.List;

import com.adneom.training.model.data.Beer;

public class BeerExpert {

	private List<Beer> beers;

	public BeerExpert() {
		beers.add(new Beer("Jack Amber", "Jack's Beer Inc."));
		beers.add(new Beer("Red Moose", "The Jungle Brewery"));
		beers.add(new Beer("Wake n'Bake", "Terrapin Beer Company"));
		beers.add(new Beer("Jail Pale Ale", "Local Prison"));
		beers.add(new Beer("Cats Piss Golden Ale", "Evil Twin Brewing"));
		beers.add(new Beer("Hoppy Ending Pale Ale", "Palo Alto Brewing Company"));
		beers.add(new Beer("Gout Stout", "MHC Hospital and Brewery"));
		beers.add(new Beer("Moo Thunder Stout", "Butternuts Beer & Ale in Garrattsville"));
	}

	public List<String> getBrands(String color) {
		List<String> brands = new ArrayList<String>();
		if (color.equals("amber") || color.equals("red")) {
			brands.add("Jack Amber");
			brands.add("Red Moose");
		} else if (color.equals("light") || color.equals("dark")) {
			brands.add("Jail Pale Ale");
			brands.add("Gout Stout");
		}
		return (brands);
	}

	public List<Beer> getBeer(String color) {
		switch (color) {
		case "amber":
		case "red":
			return beers.subList(0, 3);
		case "light":
			return beers.subList(3, 5);
		case "dark":
			return beers.subList(5, 8);
		default:
			return new ArrayList<>();
		}

	}
}
