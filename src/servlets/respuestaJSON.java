package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.Producto;
import beans.ProductoDB;

/**
 * Servlet implementation class respuestaJSON
 */
@WebServlet("/respuestaJSON")
public class respuestaJSON extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public respuestaJSON() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("application/json");
		PrintWriter out = response.getWriter();
		 out.println("{\"employees\":[\n"
	                + "    {\"firstName\":\"John\", \"lastName\":\"Doe\"},\n"
	                + "    {\"firstName\":\"Anna\", \"lastName\":\"Smith\"},\n"
	                + "    {\"firstName\":\"Peter\", \"lastName\":\"Jones\"}\n"
	                + "]}");
	}
		


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
