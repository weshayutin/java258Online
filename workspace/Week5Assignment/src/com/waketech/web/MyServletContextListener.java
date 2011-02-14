package com.waketech.web;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import com.waketech.schedule.College;

public class MyServletContextListener implements ServletContextListener{

	@Override
	public void contextDestroyed(ServletContextEvent event) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void contextInitialized(ServletContextEvent event) {
		System.out.println("Listener has started for waketech");
		ServletContext sc = event.getServletContext();
		String collegeName = sc.getInitParameter("collegeName");
		String collegeURL = sc.getInitParameter("collegeURL");
		String collegePhone = sc.getInitParameter("collegePhone");
		String collegeAddress = sc.getInitParameter("collegeAddress");
		
		College c = new College(collegeName, collegeURL, collegePhone,collegeAddress);
		sc.setAttribute("college", c);
		
		
	}

}
