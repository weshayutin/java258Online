<%@ page import="java.util.*" language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Hobbys</title>
</head>
<body>
The friends who share your hobby of
<%= request.getParameter("hobby") %>

are: <br>

<% LinkedList<String> a1 = (LinkedList)request.getAttribute("friends"); %>
<% Iterator<String> it = a1.iterator();
while(it.hasNext()){ %>
<%= it.next() %>
<br>
<%} %>
</body>
</html>