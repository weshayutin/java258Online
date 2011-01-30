package com.waketech.schedule;


public class FetchSchedule {
	
	 	public String[][] getSchedule(String studentID){
	 		
	 		String[][] s123456 =
	 		{ {"123456","CSC251","Advanced Java","Wed 5:00PM – 9:00 PM PLM 326"},
	 		  {"123456","CSC258","Java EE","Mon 5:00PM – 9:00 PM PLM 325"},
	 		  {"123456","ENG219","Neat Books","M, W, F 3:00PM – 4:00PM MSB355"} };
	 		
	 		String[][] s234567 =
	 		{ {"234567","CSC251","Advanced Java","Wed 5:00PM – 9:00 PM PLM 326"},
	 		  {"234567","CSC258","Java EE","Mon 5:00PM – 9:00 PM PLM 325"},
	 		  {"234567","ENG001","Pre Books","M, W, F 3:00PM – 4:00PM MSB316"} };
	 		
	 		String[][] s345678 = 
	 		{ {"345678","CSC134","C++","Wed 5:00PM – 9:00 PM PLM 306"},
	 		  {"345678","CSC234","Adv C++","Mon 5:00PM – 9:00 PM PLM 306"} };
	 		
	 		String[][] empty = 
	 		{ {""} };
	 		
	 		if(studentID.equals("123456")) return s123456;
	 		if(studentID.equals("234567")) return s234567;
	 		if(studentID.equals("345678")) return s345678;
	 		else{
	 			return empty;
	 		}
	 		
	 		
	 	}
	 		
	 	
	 	
}
