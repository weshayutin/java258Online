<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Pick your criteria</title>
</head>
<body>

<%
    String URI = request.getRequestURI();
    session.setAttribute("page",URI);
    out.println("<br><b> URI= "+URI+"</b><br>");
%>

<h1 align="center">Get my Schedule</h1>
<br><br><br>
<form action="schedule.do" method="POST">
  
	 <input type="SUBMIT" value="Get My Schedule"/>
	 
</form>


</body>
</html>