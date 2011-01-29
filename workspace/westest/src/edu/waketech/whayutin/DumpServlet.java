package edu.waketech.whayutin;

import java.io.IOException;
import java.io.InputStream;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DumpServlet
 */
public class DumpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DumpServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String file = request.getParameter("file");
		response.setContentType("application/jar");
		response.setHeader("Content-Disposition", "attachment; filename=/" + file); 
		
		ServletContext ctx = getServletContext();
		System.out.println(file);
		//DataInputStream is = new DataInputStream(new FileInputStream(file));
		InputStream is = ctx.getResourceAsStream(file);
		int read = 0;
		byte[] bytes = new byte[1024];
		
		ServletOutputStream os = response.getOutputStream();
		while((is != null) && (read = is.read(bytes)) != -1){
			System.out.println(read);
			os.write(bytes,0,read);
		}
		os.flush();
		os.close();
		
		
		
	}

}
