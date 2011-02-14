package com.waketech.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.waketech.schedule.UserTable;

/**
 * Servlet implementation class UserValidate
 */
public class UserValidate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserValidate() {
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
		session.putValue("referringPage", request.getHeader("Referer"));
		System.out.println("Referer ="+ request.getHeader("Referer"));
		
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String page = request.getParameter("page");
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		UserTable ut = new UserTable();
		String[][] result = null;
		
	
	
		
		if(!ut.authenticateStudenID(name, password)){
			//response.addHeader("message", "Login Failed");
			//response.setHeader("message2", "Login Failed2");
			request.setAttribute("message", "Login Failed");
			RequestDispatcher view =    request.getRequestDispatcher("login.jsp");
			view.forward(request,response);
		}
	
		else{
			
			//trying out plain sessions and cookies here

			session.setAttribute("sessionname", name);
			Cookie cookie = new Cookie("cookiename",name);
			response.addCookie(cookie);
			
			RequestDispatcher view =    request.getRequestDispatcher("menu.jsp");
			view.forward(request,response);
			
		}
	}

}
