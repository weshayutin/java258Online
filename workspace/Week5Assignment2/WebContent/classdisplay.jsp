<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Pick your Display</title>
</head>
<body>

<%
	
    String URI = request.getRequestURI();
    request.setAttribute("page",URI);
    out.println("<br><b> URI= "+URI+"</b><br>");
    out.println("page ="+session.getAttribute("page"));
%>


<h1 align="center"> Pick your criteria</h1>
<br><br><br>
<form action="display.do" name ="mydisplay" method="POST">
  <select name=mydisplay>
  <option value="C">C</option>
  <option value="E">E</option>
</select>
	
	 <input type="SUBMIT"/>
	 
</form>


</body>
</html>