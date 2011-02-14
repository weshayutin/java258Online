package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import com.waketech.schedule.College;

public final class result_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("<body>\n");
  //College c = (College)request.getAttribute("college");
	College c = (College)getServletConfig().getServletContext().getAttribute("college");
	out.println("<h1 align=\"center\">"+c.getCollegeName()+ "</h1>");
	out.println("<h2 align=\"center\">"+c.getCollegeURL()+ " " + c.getCollegePhone() + "</h2>");

      out.write("\n");
      out.write("\n");
      out.write("<br><br>\n");
      out.write("<hr/>\n");
      out.write("<br>\n");
      out.write("<p>\n");
      out.write("\n");

		
  	String[][] styles = (String[][])request.getAttribute("styles");
	String[][] classCriteria = (String[][])request.getAttribute("criteria");


	
	
	 	out.print("<center>");
		out.print("<table border = \"1\">");
		out.print("<tr><th>Class ID</th><th>Class Name</th><th>Meeting Information</th>");
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
	


      out.write("\n");
      out.write("\n");
      out.write("<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>\n");

String message = (String)request.getAttribute("lastAddDate");
out.print("<center>");
out.print(message+"</center>");
out.print("<br>");
out.print(c.getCollegeAddress()+ " "+ c.getCollegePhone());
out.print("</center>");



      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
