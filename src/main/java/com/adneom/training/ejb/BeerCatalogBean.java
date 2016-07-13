package com.adneom.training.ejb;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Local;
import javax.ejb.Stateful;

import com.adneom.training.model.data.Beer;

@Stateful
@Local(BeerCatalog.class)
public class BeerCatalogBean implements BeerCatalog {

	private List<Beer> beers;

	public BeerCatalogBean() {
		beers = new ArrayList<>();
		beers.add(new Beer("Jack Amber", "Jack's Beer Inc."));
		beers.add(new Beer("Red Moose", "The Jungle Brewery"));
		beers.add(new Beer("Wake n'Bake", "Terrapin Beer Company"));
		beers.add(new Beer("Jail Pale Ale", "Local Prison"));
		beers.add(new Beer("Cats Piss Golden Ale", "Evil Twin Brewing"));
		beers.add(new Beer("Hoppy Ending Pale Ale", "Palo Alto Brewing Company"));
		beers.add(new Beer("Gout Stout", "MHC Hospital and Brewery"));
		beers.add(new Beer("Moo Thunder Stout", "Butternuts Beer & Ale in Garrattsville"));
	}

	@Override
	public List<Beer> getBeers() {
		System.out.println("Method reached in stateful EJB: " + this.toString());
		return beers;
	}

}
