package com.waketech.schedule;

import javax.servlet.http.Cookie;
import javax.xml.ws.Response;


public class UserTable {
	
	   public boolean authenticateStudenID(String id, String password){
		  Cookie myUsername = null;
	      boolean authenticated = false;
	      if(id == null) {myUsername = null;}
	      else if (id.equals("123456") && (password.equals("123456"))) { authenticated = true; }
	      else if (id.equals("234567") && (password.equals("abcdef"))) { authenticated = true; }
	      else if (id.equals("345678") && (password.equals("ABCDEF"))) { authenticated = true; }
	      else {authenticated = false;}
	      
	      if(authenticated){
	    	   myUsername = new Cookie("username", id);
	    	   
	      }
	      return authenticated;
	      
	   }
	   
	   public boolean isUser(String id) {
		      boolean user = false;
		      if (id.equals("123456"))  { user = true; }
		      if (id.equals("234567"))  { user = true; }
		      if (id.equals("345678"))  { user = true; }
		      else {
		    	  return false;
		      }
		      
		      return user;
		   }
	

}
