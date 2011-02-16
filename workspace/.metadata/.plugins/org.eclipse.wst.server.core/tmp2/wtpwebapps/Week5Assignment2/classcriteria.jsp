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
    out.println("page ="+session.getAttribute("page"));
%>

<h1 align="center"> Pick your criteria</h1>
<br><br><br>
<form action="criteria.do" name ="criteria" method="POST">
  <select name=criteria>
  <option value="CSC">CSC</option>
  <option value="ENG">ENG</option>
</select>
	
	 <input type="SUBMIT" value="submit"/>
	 
</form>


</body>
</html>