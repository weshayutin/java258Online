package com.waketech.web;

import java.io.IOException;
import java.net.URL;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.waketech.schedule.College;
import com.waketech.schedule.FetchSchedule;
import com.waketech.schedule.UserTable;
import com.waketech.schedule.VerifyCookies;

/**
 * Servlet implementation class UserValidate
 */
public class UserValidate extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	public static String FIELD_USER = "username";
	public static String FIELD_PASSWORD = "password";
    String uri;
    String myPage;
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
		HttpSession session = request.getSession();
		String uri = (String) session.getAttribute("page");
		System.out.println("uri ="+ uri);
		String username = (String) session.getAttribute("username");
		String choice = request.getParameter("mypage");
		
		if(choice.equals("schedule")){
			session.setAttribute("page", "/Week5Assignment2/schedule.jsp");
		}
		if(choice.equals("classcriteria")){
			session.setAttribute("page", "/Week5Assignment2/classcriteria.jsp");
		}
		if(choice.equals("classdisplay")){
			session.setAttribute("page", "/Week5Assignment2/classdisplay.jsp");
		}
		
		
		if(username == null){
			RequestDispatcher view =    request.getRequestDispatcher("login.jsp");
			view.forward(request,response);
		}
		else{
			if(session.getAttribute("page").equals("/Week5Assignment2/classcriteria.jsp")){
				RequestDispatcher view =    request.getRequestDispatcher("classcriteria.jsp");
				view.forward(request,response);
			}
			else if(session.getAttribute("page").equals("/Week5Assignment2/classdisplay.jsp")){
				RequestDispatcher view =    request.getRequestDispatcher("classdisplay.jsp");
				view.forward(request,response);
			}
			else if(session.getAttribute("page").equals("/Week5Assignment2/schedule.jsp")){
				RequestDispatcher view =    request.getRequestDispatcher("schedule.jsp");
				view.forward(request,response);
			}
			else{
				RequestDispatcher view =    request.getRequestDispatcher("menu.jsp");
				view.forward(request,response);
			}
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		
		
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		UserTable ut = new UserTable();
		String[][] result = null;
		
		
		
		if(!ut.authenticateStudenID(name, password)){
			System.out.println("LOGIN PAGE");
			request.setAttribute("message", "Login Failed");
			RequestDispatcher view =    request.getRequestDispatcher("login.jsp");
			view.forward(request,response);
			//session.setAttribute("page", myPage);
		}
		else{
			session.setAttribute("username", name);
			
			if(session.getAttribute("page").equals("/Week5Assignment2/classdisplay.jsp")){
				RequestDispatcher view =    request.getRequestDispatcher("classdisplay.jsp");
				view.forward(request,response);
			}
			else if(session.getAttribute("page").equals("/Week5Assignment2/classcriteria.jsp")){
				RequestDispatcher view =    request.getRequestDispatcher("classcriteria.jsp");
				view.forward(request,response);
			}
			else if(session.getAttribute("page").equals("/Week5Assignment2/schedule.jsp")){
				RequestDispatcher view =    request.getRequestDispatcher("schedule.jsp");
				view.forward(request,response);
			}
			else{
				RequestDispatcher view =    request.getRequestDispatcher("menu.jsp");
				view.forward(request,response);
			}
			
		}
		
		
	}
	
	

}
