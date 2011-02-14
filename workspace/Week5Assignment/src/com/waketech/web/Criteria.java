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
		System.out.println("classcriteria.do");
		String name = "";
		String[][] result = null;
		
		
		HttpSession session = request.getSession();
		Cookie[] cookies = request.getCookies();
		VerifyCookies verify = new VerifyCookies();
		name = verify.verifyThisCookie(cookies,session);
		
		String myRefferingPage = "Reffering Page ="+request.getHeader("Referer");
		System.out.println(myRefferingPage);
		request.setAttribute("myRefferringPage", myRefferingPage);
		
		if(name == ""){
			RequestDispatcher view =  request.getRequestDispatcher("login.jsp");
			view.forward(request,response);
		}
		else{
			RequestDispatcher view =    request.getRequestDispatcher("classcriteria.jsp");
			view.forward(request,response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
