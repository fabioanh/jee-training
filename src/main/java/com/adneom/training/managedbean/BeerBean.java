package com.adneom.training.managedbean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

import com.adneom.training.model.BeerExpert;

@ManagedBean
public class BeerBean {

	private String color;
	private List<String> beerList;
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

	public List<String> getBeerList() {
		return beerList;
	}

	public void setBeerList(List<String> beerList) {
		this.beerList = beerList;
	}

	public List<String> getBeerColors() {
		return beerColors;
	}

	public void setBeerColors(List<String> beerColors) {
		this.beerColors = beerColors;
	}

	public String processBeerColor() {
		BeerExpert be = new BeerExpert();
		beerList = be.getBrands(color);
		return "result";
	}
}
