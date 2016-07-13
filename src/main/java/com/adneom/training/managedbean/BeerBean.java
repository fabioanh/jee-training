package com.adneom.training.managedbean;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import com.adneom.training.ejb.BeerOracle;
import com.adneom.training.model.BeerExpert;
import com.adneom.training.model.data.Beer;

@ManagedBean
public class BeerBean {
	
	@EJB
	private BeerOracle beerOracle;

	private String color;
	private List<Beer> beerList;
	private List<String> beerColors;

	public BeerBean() {
		beerColors = new ArrayList<>();
		beerColors.add("light");
		beerColors.add("amber");
		beerColors.add("brown");
		beerColors.add("dark");
		beerColors.add("red");
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public List<Beer> getBeerList() {
		return beerList;
	}

	public void setBeerList(List<Beer> beerList) {
		this.beerList = beerList;
	}

	public List<String> getBeerColors() {
		return beerColors;
	}

	public void setBeerColors(List<String> beerColors) {
		this.beerColors = beerColors;
	}

	public String processBeerColor() {
		beerList = beerOracle.getBeersByColor(color);
		return "resultTable";
	}
}
