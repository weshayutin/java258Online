package com.waketech.schedule;


public class UserTable {
	
	   public boolean authenticateStudenID(String id, String password) {
	      boolean authenticated = false;
	      if (id.equals("123456") && (password.equals("123456"))) { authenticated = true; }
	      if (id.equals("234567") && (password.equals("abcdef"))) { authenticated = true; }
	      if (id.equals("345678") && (password.equals("ABCDEF"))) { authenticated = true; }
	      
	      return authenticated;
	   }
	

}
