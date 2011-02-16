package edu.waketech.whayutin.web;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.text.View;

import edu.waketech.whayutin.HobbyExpert;

/**
 * Servlet implementation class HobbySelect
 */
public class HobbySelect extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HobbySelect() {
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
		List<String> list = new LinkedList<String>();
		String hobby = request.getParameter("hobby");
		HobbyExpert hobbyExpert = new HobbyExpert();
		list = hobbyExpert.getFriends(hobby);
		
		request.setAttribute("friends", list);
		RequestDispatcher view =    request.getRequestDispatcher("hobby.jsp");
		view.forward(request,response);
	}

}
