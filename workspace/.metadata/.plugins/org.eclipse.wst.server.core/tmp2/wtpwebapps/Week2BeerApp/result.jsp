<%@ page import="java.util.*" %>

<html>
<body>
<h1 align="center">Beer Recommendations JSP</h1>
<p>

<%
  // This is a java scriptlet where we get to write java code
  // when we want to write html that will be inserted just use 'out'
  List<String> styles = (List<String>)request.getAttribute("styles");
  String body = (String)request.getAttribute("body");
  String[] size = (String[])request.getAttribute("size");
  Iterator it = styles.iterator();
  for(String s:styles){
     out.print("<br>try: " + s);
     out.print("<br>"+s+"has a "+ body + " body");
     }
   out.print("<br> You've ordered a ");
   for(int i=0;i<size.length;i++){
	   out.print("<br>"+size[i]);
   }
%>
</body>
</html>

