<%@ page import ="java.util.*" language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login Here</title>
</head>
<body>
<%
	String message = (String)request.getAttribute("message");
    if(message == null){
    }
    else{
		out.println("<br><b>"+message+"</b><br>");
    }
    
    String myRefferingPage = (String)session.getAttribute("page");
    if(myRefferingPage == null){
    }
    else{
		out.println("<br><b>"+myRefferingPage+"</b><br>");
		response.addHeader("page",myRefferingPage);
    }
	

%>

<h1 align="center"> Login Here</h1>
<br><br><br>
<form action="ValidateUser.do" method="POST">
	Student ID: <input type="text" name="name"/><br>
	Password: <input type="password" name="password"/><br/><br/>
	
	 <input type="SUBMIT" value="Log In"/>
</form>
</body>
</html>