package edu.waketech.whayutin;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

public class ServletDumpGetHeaders {

	HttpServletRequest hsr;
	
	
	
	public void dumpRequest(HttpServletRequest request){
		Enumeration names = request.getHeaderNames();
		while (names.hasMoreElements()){
			String headerName = (String)names.nextElement();
			System.out.println("HEADER NAME="+headerName);
		}
		
		String methods = request.getMethod();
		System.out.println("METHOD ="+methods);
		
		String uri  = request.getRequestURI();
		System.out.println("URI ="+uri);
		
		String path = request.getServletPath();
		System.out.println("PATH ="+path);
		
		String queryString = request.getQueryString();
		System.out.println("QUERY STRING ="+queryString);
		
		String protocol = request.getProtocol();
		System.out.println("PROTOCOL ="+protocol);
		
		Map paramterMap = request.getParameterMap();
		Iterator it = paramterMap.entrySet().iterator();
		while(it.hasNext()){
			Map.Entry pairs = (Map.Entry)it.next();
	        System.out.println("PARAMETER KEY="+pairs.getKey() + " = PARAMETER VALUE=" + pairs.getValue());
		}
		
		String remoteHost = request.getRemoteHost();
		System.out.println("REMOTE HOST ="+ remoteHost);
	}

}
