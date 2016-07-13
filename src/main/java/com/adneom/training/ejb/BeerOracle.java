package com.adneom.training.ejb;

import java.util.List;

import com.adneom.training.model.data.Beer;

public interface BeerOracle {
	public List<Beer> getBeersByColor(String color);
}
