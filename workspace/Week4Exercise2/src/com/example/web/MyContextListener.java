package com.example.web;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class MyContextListener implements ServletContextListener {

	@Override
	public void contextDestroyed(ServletContextEvent event) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void contextInitialized(ServletContextEvent event) {
		System.out.println("Listener has started");
		ServletContext sc = event.getServletContext();
		String bookName = sc.getInitParameter("bookName");
		String authorName = sc.getInitParameter("authorName");
		String emailAddress = sc.getInitParameter("emailAddress");
		
		Book myBook = new Book(bookName,authorName,emailAddress);
		sc.setAttribute("book", myBook);
		
	}

}
