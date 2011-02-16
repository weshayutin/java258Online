package com.waketech.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.waketech.schedule.College;
import com.waketech.schedule.FetchSchedule;

/**
 * Servlet implementation class Schedule
 */
public class Schedule extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Schedule() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		String name = (String) session.getAttribute("username");
		String[][] result = null;
		FetchSchedule studentSchedule = new FetchSchedule();
		result = studentSchedule.getSchedule(name);
		College myCollege = (College)getServletContext().getAttribute("college");
		request.setAttribute("college", myCollege);
		String lastAddDate = getServletConfig().getInitParameter("lastAddDate");
		request.setAttribute("lastAddDate", lastAddDate);
		request.setAttribute("styles", result);
		RequestDispatcher view =    request.getRequestDispatcher("result.jsp");
		view.forward(request,response);
	}

}
