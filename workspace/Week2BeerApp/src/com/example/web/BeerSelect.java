package com.example.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.model.BeerExpert;

/**
 * Servlet implementation class BeerSelect
 */
public class BeerSelect extends HttpServlet
{
	private static final long serialVersionUID = 1L;
	int counter = 0;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public BeerSelect()
	{
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException
	{
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException
	{
		counter++;
		System.out.println("Counter = "+counter);
		// extract data from request html page
		String color = request.getParameter("color");
		String body = request.getParameter("body");
		String[] size = request.getParameterValues("size");
		
		// create an expert object
		BeerExpert be = new BeerExpert();
		
		// get the list of brands from the expert
		List resultColor = be.getBrands(color);
		String resultBody = be.getBody(body);
		String[] resultSize = be.getSize(size);
		
		// store the list as an attribute in the request
		request.setAttribute("styles", resultColor);
		request.setAttribute("body",resultBody);
		request.setAttribute("size",resultSize);
		
		// Create an object to send to the jap and send it
		RequestDispatcher view = request.getRequestDispatcher("result.jsp");
		view.forward(request, response);

		// done
	}

}
