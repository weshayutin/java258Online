package edu.waketech.whayutin;

import java.util.LinkedList;
import java.util.List;

public class HobbyExpert {
	
	public List<String> getFriends(String hobbyName){
		List<String> list = new LinkedList<String>();
		if(hobbyName.equals("horse skiing")){
			list.add("Fred");
			list.add("Pradeep");
			list.add("Phillpe");
		}
		else if(hobbyName.equals("alpine scuba")){
			list.add("Ben");
			list.add("Barbara");
			list.add("Biff");
		}
		else if(hobbyName.equals("speed dating")){
			list.add("John");
			list.add("Jeff");
		}
		
		return list;
	}

}
