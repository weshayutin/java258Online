package com.waketech.schedule;

/**
 * This is a horrible class, and needs to be rewritten.. this is just a hardcode
 * @author whayutin
 *
 */
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
	 	
	public String[][] getCriteria(String criteria) {
	 		
	 		String[][] CSC =
	 		{ {"CSC251","Advanced Java","Wed 5:00PM – 9:00 PM PLM 326"},
	 		  {"CSC258","Java EE","Mon 5:00PM – 9:00 PM PLM 325"},
	 		 {"CSC134","C++","Wed 5:00PM – 9:00 PM PLM 306"},
	 		  {"CSC234","Adv C++","Mon 5:00PM – 9:00 PM PLM 306"} };
	 		
	 		String[][] ENG = 
	 		{ {"ENG219","Neat Books","M, W, F 3:00PM – 4:00PM MSB355"},
	 		{"ENG001","Pre Books","M, W, F 3:00PM – 4:00PM MSB316"} };
	 		
	 		String[][] empty = 
	 		{ {""} };
	 		
	 		if(criteria.equalsIgnoreCase("csc")) return CSC;
	 		if(criteria.equalsIgnoreCase("eng")) return ENG;
	 		else{
	 			return empty;
	 		}
	 	}
	
	public String[][] getDisplay(String display) {
 		
 		String[][] C =
 		{ {"CSC251","Advanced Java","Wed 5:00PM – 9:00 PM PLM 326"},
 		  {"CSC258","Java EE","Mon 5:00PM – 9:00 PM PLM 325"},
 		 {"CSC134","C++","Wed 5:00PM – 9:00 PM PLM 306"},
 		  {"CSC234","Adv C++","Mon 5:00PM – 9:00 PM PLM 306"} };
 		
 		String[][] E = 
 		{ {"ENG219","Neat Books","M, W, F 3:00PM – 4:00PM MSB355"},
 		{"ENG001","Pre Books","M, W, F 3:00PM – 4:00PM MSB316"} };
 		
 		String[][] empty = 
 		{ {""} };
 		
 		if(display.equalsIgnoreCase("c")) return C;
 		if(display.equalsIgnoreCase("e")) return E;
 		else{
 			return empty;
 		}
 	}
	 		
	 	
	 	
}
