<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page import="java.util.*" %>

<html>
<body>
<h1 align="center">WakeTech Schedule</h1>
<br><br>
<hr/>
<br>
<p>

<%
  String[][] styles = (String[][])request.getAttribute("styles");
 	out.print("<center>");
	out.print("<table border = \"1\">");
	out.print("<tr><th>Student ID</th><th>Class ID</th><th>Class Name</th><th>Meeting Information</th>");
	out.print("</tr>");
	for(int i=0; i< styles.length;i++){
		out.print("<tr>");
		out.print("<td>"+styles[i][0]+"</td>");
		for(int j=1; j < styles[i].length;j++){
			out.print("<td>"+styles[i][j]+"</td>");
		}
		out.print("</tr>");
		out.print("</center>");
	}

%>
</body>
</html>