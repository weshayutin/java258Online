package com.waketech.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.waketech.schedule.College;
import com.waketech.schedule.FetchSchedule;

/**
 * Servlet implementation class Criteria
 */
public class Criteria extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Criteria() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String[][] result = null;
		String criteria = request.getParameter("criteria");
		System.out.println("criteria ="+criteria);
		FetchSchedule studentSchedule = new FetchSchedule();
		result = studentSchedule.getCriteria(criteria);
		College myCollege = (College)getServletContext().getAttribute("college");
		request.setAttribute("college", myCollege);
		String lastAddDate = getServletConfig().getInitParameter("lastAddDate");
		request.setAttribute("lastAddDate", lastAddDate);
		request.setAttribute("styles", result);
		RequestDispatcher view =    request.getRequestDispatcher("result.jsp");
		view.forward(request,response);
	}

}
