package com.waketech.whayutin;

import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;

public class HeaderReader {
	
	public static String getRequestHeaders(HttpServletRequest request)
	   {
	      Enumeration e = request.getHeaderNames();
	      System.out.println("Generating the Request Headers");
	      String ret = "";
	      while (e.hasMoreElements()) {
	          String name = (String)e.nextElement();
	          String value = request.getHeader(name);
	          ret = ret + name + " = " + value + "<br>";
	      }
	      return ret;
	   }

}
