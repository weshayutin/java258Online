<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page import="java.util.*" %>
<%@ page import="com.waketech.schedule.College" %>

<html>
<body>
<%  //College c = (College)request.getAttribute("college");
	College c = (College)getServletConfig().getServletContext().getAttribute("college");
	out.println("<h1 align=\"center\">"+c.getCollegeName()+ "</h1>");
	out.println("<h2 align=\"center\">"+c.getCollegeURL()+ " " + c.getCollegePhone() + "</h2>");
%>

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
	out.print("</table>");

%>

<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
<%
String message = (String)request.getAttribute("lastAddDate");
out.print("<center>");
out.print(message+"</center>");
out.print("<br>");
out.print(c.getCollegeAddress()+ " "+ c.getCollegePhone());
out.print("</center>");


%>

</body>
</html>