package com.adneom.training.ejb;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebService;

import com.adneom.training.model.data.Beer;

@Stateless
@Local(BeerOracle.class)
//@WebService(serviceName="BeerOracle", portName="BeerOraclePort")
@WebService
public class BeerOracleBean implements BeerOracle {

	@EJB
	private BeerCatalog beerCatalog;

	@Override
	@WebMethod
	public List<Beer> getBeersByColor(String color) {
		System.out.println("Method reached in statless EJB: " + this.toString());
		switch (color) {
		case "amber":
		case "red":
			return beerCatalog.getBeers().subList(0, 3);
		case "light":
			return beerCatalog.getBeers().subList(3, 5);
		case "dark":
			return beerCatalog.getBeers().subList(5, 8);
		default:
			return new ArrayList<>();
		}
	}

}
