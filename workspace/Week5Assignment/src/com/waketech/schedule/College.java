package com.waketech.schedule;

public class College {
	
	String collegeName;
	String collegeURL;
	String collegePhone;
	String collegeAddress;
	
	public College(String collegeName, String collegeURL, String collegePhone,String collegeAddress){
		this.collegeName = collegeName;
		this.collegeURL = collegeURL;
		this.collegePhone = collegePhone;
		this.collegeAddress = collegeAddress;
	}
	
	public String getCollegeName() {
		return collegeName;
	}
	public String getCollegeURL() {
		return collegeURL;
	}
	public String getCollegePhone() {
		return collegePhone;
	}
	public String getCollegeAddress(){
		System.out.println("collegeAddress ="+ collegeAddress);
		return collegeAddress;
	}
	
	

}
