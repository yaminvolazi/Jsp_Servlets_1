
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet_1
 */
@WebServlet("/Servlet_1")
public class Servlet_1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String message;

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		message = "Hello World";
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// Set response content type
		response.setContentType("text/html");

		// Actual logic goes here.
		PrintWriter out = response.getWriter();
		try {
			
		} catch (Exception e) {
			
		}
		response.getWriter().append("Full Name: ").append(request.getParameter("full_name"));
		response.getWriter().append("<br>");
		response.getWriter().append("Email: ").append(request.getParameter("email"));
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

}
