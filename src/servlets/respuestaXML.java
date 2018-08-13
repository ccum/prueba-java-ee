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
 * Servlet implementation class respuestaXML
 */
@WebServlet("/respuestaXML")
public class respuestaXML extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public respuestaXML() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/xml;charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		out.println("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
        out.println("<CATALOG>");
        out.println("<PRODUCTO>");

		
		ProductoDB db = new ProductoDB();
		List<Producto> lista = db.getAll();
		
		for (Producto prod: lista) {
			out.println("<ID>" + prod.getId() + "</ID>");
			out.println("<CATEGORIA>" + prod.getCategoria() + "</CATEGORIA>");
			out.println("<NOMBRE>" + prod.getNombre() + "</NOMBRE>");
		}
		// Termina contenido dinamico
		 out.println("</PRODUCTO>");
		out.println("</CATALOG>");


	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
