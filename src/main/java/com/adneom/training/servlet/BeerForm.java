package com.adneom.training.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.adneom.training.model.BeerExpert;

@WebServlet(description = "Servlet used to get the initial form for the beer recomendator", urlPatterns = {
		"/BeerForm" })
public class BeerForm extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5570882476757371884L;

	private static final Object EMPTY_MESSAGE = "Sadly we couldn't find any recommendation for you at the moment";

	private List<String> beerColors;

	public BeerForm() {
		beerColors = new ArrayList<>();
		beerColors.add("light");
		beerColors.add("amber");
		beerColors.add("brown");
		beerColors.add("dark");
		beerColors.add("red");
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setAttribute("colors", beerColors);
		RequestDispatcher rd = getServletContext().getRequestDispatcher("/beerForm.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		BeerExpert be = new BeerExpert();
		List<String> result = be.getBrands(request.getParameter("color"));
		request.setAttribute("styles", result);
		request.setAttribute("emptyStylesMessage", EMPTY_MESSAGE);
		RequestDispatcher rd = getServletContext().getRequestDispatcher("/result.jsp");
		rd.forward(request, response);
	}

}
