<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title> Welcome to WakeTech</title>
<h1 align="center"> Welcome to WakeTech</h1>
</head>
<body>
<br><br><br>
<form method="post" action="ValidateUser.do">
 <select name=mypage>
  <option value="login">Login</option>
  <option value="classcriteria">Search By Criteria</option>
  <option value="classdisplay">Search By Prefix</option>
  <option value="schedule">Display Student Schedule</option>
</select>
	
	 <input type="SUBMIT"/>



</form>


</body>
</html>