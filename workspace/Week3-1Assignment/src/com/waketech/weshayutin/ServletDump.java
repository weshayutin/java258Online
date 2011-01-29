package com.waketech.weshayutin;

import java.util.ArrayList;
import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;

public class ServletDump {
	
	public void dumpRequest(HttpServletRequest request){
		ArrayList<String> headers = new ArrayList<String>();
		Enumeration e = request.getHeaderNames();
		while(e.hasMoreElements()){
		headers.add((String)e.nextElement());
		}
		int i = 0;
		while(i<headers.size()){
		System.out.println(headers.get(i)+":"+request.getHeader(headers.get(i)));
		i++;
		}
		
	}

}
