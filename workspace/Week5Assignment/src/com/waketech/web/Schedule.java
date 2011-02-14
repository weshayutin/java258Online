package com.waketech.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.waketech.schedule.College;
import com.waketech.schedule.FetchSchedule;
import com.waketech.schedule.VerifyCookies;

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
		System.out.println("schedule.do");
		String name = "";
		String[][] result = null;
		
		HttpSession session = request.getSession();
		Cookie[] cookies = request.getCookies();
		VerifyCookies verify = new VerifyCookies();
		name = verify.verifyThisCookie(cookies,session);
		
		
		
		request.setAttribute("myRefferringPage", "schedule.do");
		
		if(name == ""){
			RequestDispatcher view =  request.getRequestDispatcher("login.jsp");
			view.forward(request,response);
		}
		else{
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

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
