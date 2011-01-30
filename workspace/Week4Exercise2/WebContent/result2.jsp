<%@page import="com.example.web.Book"%>
<%@ page import="java.util.*" %>

<html>
<body>
<h1 align="center">Beer Recommendations JSP</h1>
<p>

<%
  List styles = (List)request.getAttribute("styles");
  Iterator it = styles.iterator();
  while(it.hasNext()) {
     out.print("<br>try: " + it.next());
     }
   out.println("<br><br>");
   
   Book myBook = (Book)request.getAttribute("book");
   out.println("<br>"+ myBook.getBookName());
   out.println("<br>"+ myBook.getAuthorName());
   out.println("<br>"+ myBook.getEmailAddress());
  
   
%>
</body>
</html>