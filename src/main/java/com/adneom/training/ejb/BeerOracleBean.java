package com.adneom.training.ejb;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Local;
import javax.ejb.Stateless;

import com.adneom.training.model.data.Beer;

@Stateless
@Local(BeerOracle.class)
public class BeerOracleBean implements BeerOracle {

	@Override
	public List<Beer> getBeersByColor(String color) {
		System.out.println("Method reached in statless EJB");
		List<Beer> beers = new ArrayList<>();
		beers.add(new Beer("Jack Amber", "Jack's Beer Inc."));
		beers.add(new Beer("Red Moose", "The Jungle Brewery"));
		beers.add(new Beer("Wake n'Bake", "Terrapin Beer Company"));
		beers.add(new Beer("Jail Pale Ale", "Local Prison"));
		beers.add(new Beer("Cats Piss Golden Ale", "Evil Twin Brewing"));
		beers.add(new Beer("Hoppy Ending Pale Ale", "Palo Alto Brewing Company"));
		beers.add(new Beer("Gout Stout", "MHC Hospital and Brewery"));
		beers.add(new Beer("Moo Thunder Stout", "Butternuts Beer & Ale in Garrattsville"));
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
