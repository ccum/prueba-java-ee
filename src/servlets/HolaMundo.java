package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HolaMundo extends HttpServlet {

	
	private static final long serialVersionUID = 6856130492999436903L;
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		super.init(config);
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doGet(req, resp);
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.println("<html>");
	    out.println("<body>");
	    out.println("<h1>Hola Mundo (llamada GET)</h1>");
	    out.println("</body>");
	    out.println("</html>");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doPost(req, resp);
		resp.setContentType("text/html");
	    PrintWriter out = resp.getWriter();
	    out.println("<html>");
	    out.println("<body>");
	    out.println("<h1>Hola Mundo (llamada POST)</h1>");
	    out.println("</body>");
	    out.println("</html>");
	}

	/**
	 * 
	 */
	
	
	

}
